package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.mapper.MusicMapper;
import com.yiguan.douban.pojo.CommentMusicPojo;
import com.yiguan.douban.service.MusicService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @author: chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
@Service
public class MusicServiceImpl implements MusicService {
    @Resource
    private MusicMapper musicMapper;

    @Override
    public List<Music> findAllMusic(){
        List<Music> list = new ArrayList<>();
        list = musicMapper.selectAll();
        return list;
    }

    @Override
    public List<CommentMusicPojo> findTopNCommentMusic(Integer number) {
        List<CommentMusicPojo> commentMusicPojo = musicMapper.topNCommentMusic(number);

        return commentMusicPojo;
    }

    @Override
    public boolean topNCommentMusicToExcel(HttpServletResponse response, Integer number) {

        // 记录行号
        int rowNum = 1;

        // 创建工作区
        HSSFWorkbook sheets = new HSSFWorkbook();
        HSSFSheet sheet = sheets.createSheet("testTable");

        // 得到数据
        List<CommentMusicPojo> top5CommentMusic = findTopNCommentMusic(number);

        // 设置表名
        String fileName = "topNMusics" + ".xls";

        // 创建表头
        Class<CommentMusicPojo> commentMusicPojoClass = CommentMusicPojo.class;
        HSSFRow row = sheet.createRow(0);
        Field[] declaredFields = commentMusicPojoClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString hssfRichTextString = new HSSFRichTextString(declaredFields[i].getName());
            cell.setCellValue(hssfRichTextString);
        }

        // 插入数据
        for (CommentMusicPojo music: top5CommentMusic) {
            HSSFRow row1 = sheet.createRow(rowNum);

            Class<? extends CommentMusicPojo> aClass = music.getClass();
            Field[] musicDeclaredFields = aClass.getDeclaredFields();
            for (int i = 0; i < musicDeclaredFields.length; i++) {
                musicDeclaredFields[i].setAccessible(true);
                try {
                    row1.createCell(i).setCellValue(musicDeclaredFields[i].get(music).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            rowNum++;
        }

        // 根据表名创建表，并响应
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.setContentType("application/octet-stream;charset=UTF-8");
        try {

            // 流关闭
            response.flushBuffer();
            sheets.write(response.getOutputStream());
            sheets.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    @Override
    public Music findMusicById(Integer id){
        Music music = musicMapper.selectByPrimaryKey(id);
        return music;
    }

}

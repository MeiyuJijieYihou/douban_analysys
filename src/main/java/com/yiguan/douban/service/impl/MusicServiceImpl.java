package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.mapper.MusicMapper;
import com.yiguan.douban.pojo.Top5CommentMusicPojo;
import com.yiguan.douban.service.MusicService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Music> findAllMusic(){
        List<Music> list = new ArrayList<>();
        list = musicMapper.selectAll();
        return list;
    }

    @Override
    public List<Top5CommentMusicPojo> findTop5CommentMusic() {
        List<Top5CommentMusicPojo> top5CommentMusicPojo = musicMapper.top5CommentMusic();

        return top5CommentMusicPojo;
    }

    @Override
    public boolean top5CommentMusicToExcel(HttpServletResponse response) {

        // 记录行号
        int rowNum = 1;

        // 创建工作区
        HSSFWorkbook sheets = new HSSFWorkbook();
        HSSFSheet sheet = sheets.createSheet("testTable");

        // 得到数据
        List<Top5CommentMusicPojo> top5CommentMusic = findTop5CommentMusic();

        // 设置表名
        String fileName = "to5Musics" + ".xls";

        // 创建表头
        String[] headers = new String[]{"name", "singer", "style", "issue_date", "comment_number"};
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString hssfRichTextString = new HSSFRichTextString(headers[i]);
            cell.setCellValue(hssfRichTextString);
        }

        // 插入数据
        for (Top5CommentMusicPojo music: top5CommentMusic) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(music.getName());
            row1.createCell(1).setCellValue(music.getSinger());
            row1.createCell(2).setCellValue(music.getStyle());
            row1.createCell(3).setCellValue((music.getIssueDate().toString()));
            row1.createCell(4).setCellValue(music.getCommentNumber());
            rowNum++;
        }

        // 根据表名创建表，并相应
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

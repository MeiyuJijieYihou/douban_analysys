package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.mapper.MusicMapper;
import com.yiguan.douban.pojo.SimpleMusicInfoPojo;
import com.yiguan.douban.pojo.SimpleMusicPojo;
import com.yiguan.douban.service.MusicService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public List<Music> findTopNMusic(Integer number) {
        return musicMapper.topNMusic(number);
    }

    @Override
    public List<SimpleMusicInfoPojo> findTopNCommentMusic(Integer number) {
        List<SimpleMusicInfoPojo> simpleMusicPojo = musicMapper.topNCommentMusic(number);

        return simpleMusicPojo;
    }

    @Override
    public boolean topNCommentMusicToExcel(HttpServletResponse response, Integer number) {

        // 记录行号
        int rowNum = 1;
        // 时间格式化模板
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        // 创建工作区
        HSSFWorkbook sheets = new HSSFWorkbook();
        HSSFSheet sheet = sheets.createSheet("musics");

        // 得到数据
        List<SimpleMusicPojo> topNCommentMusic = musicMapper.topNCommentMusicExcel(number);

        // 设置表名
        String fileName = "top" + number + "Musics.xls";

        // 创建表头
        // java反射
        Class<SimpleMusicPojo> commentMusicPojoClass = SimpleMusicPojo.class;
        // 得到表头行
        HSSFRow header = sheet.createRow(0);
        // 插入排名字段头
        header.createCell(0).setCellValue("Ranking");
        // 得到所有的成员变量
        Field[] declaredFields = commentMusicPojoClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            // 创建表头单元格
            HSSFCell cell = header.createCell(i + 1);
            // 得到成员变量名称作为插入值
            HSSFRichTextString hssfRichTextString = new HSSFRichTextString(declaredFields[i].getName());
            cell.setCellValue(hssfRichTextString);
        }

        // 插入数据
        for (SimpleMusicPojo music: topNCommentMusic) {
            // 得到内容行
            HSSFRow info = sheet.createRow(rowNum);
            // 插入排名字段内容
            info.createCell(0).setCellValue(rowNum);
            // java反射
            Class<? extends SimpleMusicPojo> aClass = music.getClass();
            // 获得所以成员变量
            Field[] musicDeclaredFields = aClass.getDeclaredFields();
            for (int i = 0; i < musicDeclaredFields.length; i++) {
                // 设置该成员变量可访问
                musicDeclaredFields[i].setAccessible(true);
                try {
                    // 得到成员变量的值，并将其插入表中
                    if (musicDeclaredFields[i].get(music) instanceof Date) {
                        info.createCell(i + 1).setCellValue(simpleDateFormat.format(musicDeclaredFields[i].get(music)));
                    } else {
                        info.createCell(i + 1).setCellValue(musicDeclaredFields[i].get(music).toString());
                    }
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

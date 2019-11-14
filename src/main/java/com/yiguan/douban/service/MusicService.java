package com.yiguan.douban.service;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.CommentMusicPojo;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: Thomas chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */

public interface MusicService {

    /**
     * get all musics
     * @return
     */
    public List<Music> findAllMusic();


    /**
     * 评论榜前N的音乐
     * @param number
     * @return
     */
    List<CommentMusicPojo> findTopNCommentMusic(Integer number);


    /**
     * 导出评论榜前N的数据到Excel表中
     * @param response
     * @param number
     * @return
     */
    boolean topNCommentMusicToExcel(HttpServletResponse response, Integer number);

    /**
     * 根据音乐id 获取音乐的详细信息
     * @return
     */
    Music findMusicById(Integer id);
}

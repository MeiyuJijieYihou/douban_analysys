package com.yiguan.douban.service;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.Top5CommentMusicPojo;

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
     * 评论榜前5 的音乐
     * 本地模拟数据库测试成功，由于该项目连接数据库还没有足够数据，暂时查出数据为空
     * @return
     */
    List<Top5CommentMusicPojo> findTop5CommentMusic();

    /**
     * 导出评论榜前5 的数据到Excel表中
     * 本地模拟数据库测试成功，由于该项目连接数据库还没有足够数据，暂时查出数据为空
     * @return
     */
    boolean top5CommentMusicToExcel(HttpServletResponse response);

    Music findMusicById(Integer id);
}

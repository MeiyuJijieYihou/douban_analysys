package com.yiguan.douban.service;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.MusicColumnCommentPojo;
import com.yiguan.douban.pojo.MusicNewCommentPojo;
import com.yiguan.douban.pojo.SimpleMusicInfoPojo;
import com.yiguan.douban.pojo.SimpleMusicPojo;
import io.swagger.models.auth.In;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

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
    List<SimpleMusicInfoPojo> findTopNCommentMusic(Integer number);


    /**
     * 导出评论榜前N的数据到Excel表中
     * @param response
     * @param number
     * @return
     */
    boolean topNCommentMusicToExcel(HttpServletResponse response, Integer number);

    /**
     * 根据音乐id 获取音乐的详细信息
     * @param id
     * @return
     */
    Music findMusicById(Integer id);

    /**
     * 根据音乐id得到最新的N条音乐评论，N由前端传入，默认为10
     * @param id,num
     * @return
     */
    List<MusicNewCommentPojo> topNMusicNewComment(Integer id, Integer num);

}

package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.SimpleMusicInfoPojo;
import com.yiguan.douban.pojo.SimpleMusicPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author:  chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
public interface MusicMapper extends Mapper<Music> {


    /**
     * 评论榜前N的音乐
     * @param number
     * @return
     */
    List<SimpleMusicInfoPojo> topNCommentMusic(Integer number);

    /**
     * 评论榜前N的音乐导出到Excel表中
     * @param number
     * @return
     */
    List<SimpleMusicPojo> topNCommentMusicExcel(Integer number);

    /**
     * 流行音乐
     * @param number
     * @return
     */
    List<Music> topNMusic(Integer number);
}

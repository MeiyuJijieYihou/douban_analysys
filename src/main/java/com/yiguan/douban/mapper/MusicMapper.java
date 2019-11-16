package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.CommentMusicPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author:  chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
public interface MusicMapper extends Mapper<Music> {


    /**
     * 评论前N的音乐
     * @param number
     * @return
     */
    List<CommentMusicPojo> topNCommentMusic(Integer number);

    /**
     * 流行音乐
     * @param number
     * @return
     */
    List<Music> topNMusic(Integer number);
}

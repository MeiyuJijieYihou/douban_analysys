package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.Top5CommentMusicPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author:  chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
public interface MusicMapper extends Mapper<Music> {

    /**
     * Get top 5
     * @return
     */
    List<Top5CommentMusicPojo> top5CommentMusic();
}

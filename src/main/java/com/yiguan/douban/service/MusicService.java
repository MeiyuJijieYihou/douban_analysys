package com.yiguan.douban.service;

import com.yiguan.douban.entity.Music;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

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
     * Get top 5 comment musics
     * @return
     */
    List<Map<String, Object>> findTop5Music();

    public Music findMusicById(Integer id);
}

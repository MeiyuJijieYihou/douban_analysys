package com.yiguan.douban.service;

import com.yiguan.douban.entity.Music;

import java.util.List;

/**
 * @author: Thomas chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
public interface MusicService {
    public List<Music> findAllMusic();
}

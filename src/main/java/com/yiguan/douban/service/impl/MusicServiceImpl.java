package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.mapper.MusicMapper;
import com.yiguan.douban.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
}

package com.yiguan.douban.controller;


import com.yiguan.douban.entity.Music;
import com.yiguan.douban.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api/music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/h")
    public String hello(){
        return "MusicController Hello world!";
    }

    @GetMapping("/get")
    public List<Music> getAllMusic(){
        List<Music> list = musicService.findAllMusic();
        return list;
    }
}

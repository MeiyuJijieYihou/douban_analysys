package com.yiguan.douban.controller;


import com.yiguan.douban.entity.Music;
import com.yiguan.douban.service.MusicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

/**
 * @author: chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api/music")
@Api(description = "音乐相关接口文档")
public class MusicController {
    @Autowired
    private MusicService musicService;


    @GetMapping("/h")
    @ApiOperation("测试显示")
    public String hello(){
        return "MusicController Hello world!";
    }

    @GetMapping("/get")
    @ApiOperation("获取所有音乐列表")
    public List<Music> getAllMusic(){
        List<Music> list = musicService.findAllMusic();
        return list;
    }

    @GetMapping("/get/top5")
    public List<Map<String, Object>> top5() {

        List<Map<String, Object>> top5Music = musicService.findTop5Music();
        return top5Music;
    }

}

package com.yiguan.douban.controller;


import com.yiguan.douban.entity.Music;
import com.yiguan.douban.pojo.MusicNewCommentPojo;
import com.yiguan.douban.pojo.SimpleMusicInfoPojo;
import com.yiguan.douban.service.MusicService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    @GetMapping("/get/top{number}")
    @ApiOperation("查询评论排名前N的musics")
    @ApiImplicitParam(name = "查询数量", value = "默认为50条")
    public List<SimpleMusicInfoPojo> topN(@PathVariable Integer number) {
        if (number == null) {
            number = 50;
        }
        List<SimpleMusicInfoPojo> topNCommentMusic = musicService.findTopNCommentMusic(number);
        return topNCommentMusic;
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据ID查询音乐信息")
    public Music getMusicById(@PathVariable Integer id){
        return  musicService.findMusicById(id);
    }

    @GetMapping("/get/topNToExcel")
    @ApiOperation("导出评论前N的musics到Excel中")
    public String topNToExcel(HttpServletResponse response) {

        boolean b = musicService.topNCommentMusicToExcel(response, 50);
        if (b) {
            return "Success";
        }
        return "Failure";
    }

    @GetMapping("/getN/{id}/{num}")
    @ApiOperation("根据音乐id得到最新的N条音乐评论，N由前端传入，默认为10")
    public List<MusicNewCommentPojo> topNMusicNewComment(@PathVariable(required = false)Integer id,
                                                         @PathVariable(required = false)Integer num) {
        return musicService.topNMusicNewComment(id,num);
    }

}

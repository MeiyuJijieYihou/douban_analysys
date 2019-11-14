package com.yiguan.douban.controller;

import com.yiguan.douban.pojo.MoviePojo;
import com.yiguan.douban.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: 对电影表进行操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:30
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api/movie")
@Api(description = "电影相关接口文档")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/sayHello")
    @ApiOperation("测试接口")
    public String sayHello() {
        return "Hello, welcome to MovieController";
    }

    @GetMapping("/get")
    @ApiOperation("获取所有电影信息")
    public List<MoviePojo> getAllMovies() {
        return movieService.findAllMovies();
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据电影id获取电影信息")
    public MoviePojo getMovieById(@PathVariable Integer id) {
        return movieService.findMovieById(id);
    }

    @GetMapping("/get/top50")
    @ApiOperation("查询出当前一周评论最多的50个亚洲区域视频降序排列")
    public List<MoviePojo> getMoviesTop50() {
        return movieService.findMoviesTop50();
    }
}
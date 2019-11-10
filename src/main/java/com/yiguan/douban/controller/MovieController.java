package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Movie;
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
 * @date 2019/11/8 下午9:30
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api/movie")
@Api("电影相关接口文档")
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
    public List<Movie> getAllMovie() {
        return movieService.findAllMovie();
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据电影id获取电影信息")
    public Movie getMovieById(@PathVariable Integer id) {
        return movieService.findMovieById(id);
    }
}
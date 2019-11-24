package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.pojo.MoviePojo;
import com.yiguan.douban.pojo.SimpleMoviePojo;
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

    @GetMapping("/get/{id}")
    @ApiOperation("根据电影id获取电影信息")
    public MoviePojo getMovieById(@PathVariable Integer id) {
        return movieService.findMovieById(id);
    }

    @GetMapping({"/topMovies/{num}", "/topMovies"})
    @ApiOperation("查询出当前一周评论最多的N个亚洲区域视频降序排列")
    public List<SimpleMoviePojo> getTopMovies(@PathVariable(required = false) Integer num) {
        if (null == num) {
            num = 50;
        } else if (num <= 0) {
            return null;
        }
        return movieService.findTopMovies(num);
    }

    @GetMapping({"/newComments/{id}/{num}", "/newComments/{id}"})
    @ApiOperation("根据电影id查找最新的N/2条电影短评论和N/2条电影影评")
    public List<Comment> getTopMovies(@PathVariable Integer id, @PathVariable(required = false) Integer num) {
        if (null == num) {
            num = 10;
        } else if (num <= 0) {
            return null;
        }
        return movieService.findNewComments(id, num / 2 == 0 ? 1 : num / 2);
    }
}
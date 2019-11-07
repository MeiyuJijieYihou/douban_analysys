package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Movie;
import com.yiguan.douban.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author abing
 * @create 2019/11/4 下午11:08
 */

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello, welcome to MovieController";
    }

    @GetMapping("/get")
    public List<Movie> getAllMovie() {
        return movieService.findAllMovie();
    }

    @GetMapping("/get/{id}")
    public Movie getMovieById(@PathVariable Integer id) {
        return movieService.findMovieById(id);
    }
}

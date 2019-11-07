package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Movie;
import com.yiguan.douban.mapper.MovieMapper;
import com.yiguan.douban.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author abing
 * @create 2019/11/4 下午11:20
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;

    @Override
    public List<Movie> findAllMovie() {

        List<Movie> movies = movieMapper.selectAll();
        return movies;
    }
}

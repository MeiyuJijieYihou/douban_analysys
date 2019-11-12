package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Movie;
import com.yiguan.douban.entity.Region;
import com.yiguan.douban.mapper.MovieMapper;
import com.yiguan.douban.mapper.MovieRegionMapper;
import com.yiguan.douban.pojo.MoviePojo;
import com.yiguan.douban.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: 实现对电影表的操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:38
 * @since JDK 1.8
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;
    @Resource
    private MovieRegionMapper movieRegionMapper;

    @Override
    public List<MoviePojo> findAllMovies() {
        return movieMapper.selectAllMovies();
    }

    @Override
    public MoviePojo findMovieById(Integer id) {
        return movieMapper.findMovieById(id);
    }

    @Override
    public List<MoviePojo> findMoviesTop50() {
        return movieMapper.selectMoviesTop50();
    }
}

package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Movie;
import com.yiguan.douban.mapper.MovieMapper;
import com.yiguan.douban.mapper.MovieRegionMapper;
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
    @Resource
    private MovieRegionMapper movieRegionMapper;

    @Override
    public List<Movie> findAllMovie() {
        return movieMapper.selectAll();
    }

    @Override
    public Movie findMovieById(Integer id) {
        Movie movie = movieMapper.selectByPrimaryKey(id);
        List<String> countriesRegions = movieRegionMapper.selectCountriesRegionsByMovieId(id);
        StringBuilder s = new StringBuilder();
        for (String cr : countriesRegions) {
            s.append(cr);
            s.append("/");
        }
        if ("".contentEquals(s)) {
            return null;
        }
        s.deleteCharAt(s.length() - 1);
        movie.setCountriesRegions(s.toString());
        return movie;
    }

    @Override
    public List<Movie> findTop50movie(){
        return movieMapper.select_Top50movie();
    }
}

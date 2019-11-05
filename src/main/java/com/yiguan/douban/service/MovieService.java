package com.yiguan.douban.service;

import com.yiguan.douban.entity.Movie;

import java.util.List;

/**
 * @author abing
 * @create 2019/11/4 下午11:19
 */
public interface MovieService {
    List<Movie> findAllMovie();
}

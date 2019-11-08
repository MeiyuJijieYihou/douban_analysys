package com.yiguan.douban.service;

import com.yiguan.douban.entity.Movie;

import java.util.List;

/**
 * Description: 定义了操作电影表的方法
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:43
 * @since JDK 1.8
 */
public interface MovieService {

    List<Movie> findAllMovie();

    Movie findMovieById(Integer id);

}

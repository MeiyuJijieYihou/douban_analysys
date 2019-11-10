package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Movie;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Description: 操作movie数据库表
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 下午9:36
 * @since JDK 1.8
 */
public interface MovieMapper extends Mapper<Movie> {

    /* 
     * @description 查询所有的电影信息
     * 
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.Movie>
     * @author LiBingxiang
     * @date 2019/11/10 上午11:40
     */
    List<Movie> selectAllMovies();

}

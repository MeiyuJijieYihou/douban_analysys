package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Movie;
import com.yiguan.douban.pojo.MoviePojo;
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
public interface MovieMapper {

    /* 
     * @description 查询所有的电影信息
     * 
     * @params []
     * @return java.util.List<com.yiguan.douban.entity.Movie>
     * @author LiBingxiang
     * @date 2019/11/10 上午11:40
     */
    List<MoviePojo> selectAllMovies();

    /*
     * @description 根据电影id查询电影信息
     *
     * @params [id]
     * @return com.yiguan.douban.pojo.MoviePojo
     * @author LiBingxiang
     * @date 2019/11/12 下午8:28
     */
    MoviePojo findMovieById(Integer id);

    /*
     * @description 查询出当前一周评论最多的50个亚洲区域视频降序排列
     *
     * @params []
     * @return com.yiguan.douban.pojo.MoviePojo
     * @author LiBingxiang
     * @date 2019/11/12 下午8:28
     */
    List<MoviePojo> selectMoviesTop50();
}

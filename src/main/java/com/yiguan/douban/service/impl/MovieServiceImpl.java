package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.mapper.CommentMapper;
import com.yiguan.douban.mapper.MovieMapper;
import com.yiguan.douban.mapper.MovieRegionMapper;
import com.yiguan.douban.pojo.MoviePojo;
import com.yiguan.douban.pojo.SimpleMoviePojo;
import com.yiguan.douban.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Description: 实现对电影表的操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:38
 * @since JDK 1.8
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieMapper movieMapper;
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<MoviePojo> findAllMovies() {
        return movieMapper.selectAllMovies();
    }

    @Override
    public MoviePojo findMovieById(Integer id) {
        return movieMapper.findMovieById(id);
    }

    @Override
    public List<SimpleMoviePojo> findTopMovies(Integer num) {
        Date nowTime = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowTime);
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        Date preTime = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return movieMapper.selectTopMovies(sdf.format(preTime), sdf.format(nowTime), num);
    }

    @Override
    public List<Comment> findNewComments(Integer id, Integer num) {
        List<Comment> shortComments = commentMapper.selectNewShortComments(id, num);
        List<Comment> comments = commentMapper.selectNewComments(id, num);
        shortComments.addAll(comments);
        return shortComments;
    }
}

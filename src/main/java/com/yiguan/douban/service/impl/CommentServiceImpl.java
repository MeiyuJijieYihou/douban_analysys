package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.mapper.CommentMapper;
import com.yiguan.douban.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.List;

/**
 * @author abing
 * @create 2019/11/4 下午11:19
 */

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAllComment() {

        List<Comment> comments = commentMapper.selectAll();
        return comments;
    }
}

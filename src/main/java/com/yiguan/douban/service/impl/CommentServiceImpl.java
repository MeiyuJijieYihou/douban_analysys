package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.mapper.CommentMapper;
import com.yiguan.douban.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: 实现对评论表的操作
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/8 21:41
 * @since JDK 1.8
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAllComment() {
        return commentMapper.selectAll();
    }
}

package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Comment;
import com.yiguan.douban.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author abing
 * @create 2019/11/4 下午11:09
 */

@RequestMapping("/api/comment")
@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/get")
    public List<Comment> getAllComment() {

        return commentService.findAllComment();
    }
}

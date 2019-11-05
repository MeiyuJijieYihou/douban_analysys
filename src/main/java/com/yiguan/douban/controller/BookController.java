package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Function
 * @Date: 2019/11/5 19:10
 */
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/h")
    public String hello(){
        return "BookController Hello world!";
    }

    @GetMapping("/get")
    public List<Book> getAllBook(){
        List<Book> list = bookService.findAllBook();
        return list;
    }
}

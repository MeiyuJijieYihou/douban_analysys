package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookPojo;
import com.yiguan.douban.service.BookService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@Slf4j
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

    @GetMapping("/get/{id}")
    public Book findBookById(@PathVariable Integer id){
        return bookService.findBookById(id);
    }

    @GetMapping("/topSort")
    @ApiOperation("查询最火的书籍标签")
    public String topSort(){
        return bookService.topSort();
    }

    @GetMapping("/topTenBook")
    @ApiOperation("查询最火标签下评论数最多的10本书")
    public List<BookPojo> topTenBook(){
        return bookService.topTenBook(topSort());
    }
}

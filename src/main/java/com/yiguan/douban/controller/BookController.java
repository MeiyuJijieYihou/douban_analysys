package com.yiguan.douban.controller;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookNewCommentPojo;
import com.yiguan.douban.pojo.BookPojo;
import com.yiguan.douban.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookController
 * @Description: TODO(书籍相关查询操作)
 * @Author: 付晓
 * @Date: 2019/11/5 19:10
 */
@Slf4j
@RestController
@RequestMapping("/api/book")
@Api(description = "书籍相关接口文档")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/h")
    @ApiOperation("Hello World测试")
    public String hello(){
        return "BookController Hello World!";
    }

    @GetMapping("/get")
    @ApiOperation("查询所有书籍")
    public List<Book> getAllBook(){
        List<Book> list = bookService.findAllBook();
        return list;
    }

    @GetMapping("/get/{id}")
    @ApiOperation("根据id查询书籍")
    public Book findBookById(@PathVariable Integer id){
        return bookService.findBookById(id);
    }

    @GetMapping({"/topBook/{num}","/topBook"})
    @ApiOperation("最火类目书籍降序排行，排行数目由前端传入，默认为10")
    public List<BookPojo> topBook(@PathVariable(required=false)Integer num){
        if( null == num){
            num = 10;
        }
        return bookService.topBook(num);
    }

    @GetMapping("/get/{id}/{num}")
    @ApiOperation("根据id查询书籍最新的N条评论，N默认为10")
    public List<BookNewCommentPojo> topNBookNewComment(@PathVariable(required = false)Integer id, Integer num){
        if (null == num) {
            num = 10;
        }
        return bookService.topNBookNewComment(id,num);
    }
}

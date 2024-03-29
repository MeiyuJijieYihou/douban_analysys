package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.mapper.BookMapper;
import com.yiguan.douban.pojo.BookNewCommentPojo;
import com.yiguan.douban.pojo.BookPojo;
import com.yiguan.douban.pojo.BookTagPojo;
import com.yiguan.douban.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookServiceImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 付晓
 * @Date: 2019/11/5 19:29
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    /**
     * 查询所有书籍
     */
    @Override
    public List<Book> findAllBook() {
        List<Book> list = new ArrayList<>();
        list = bookMapper.selectAll();
        return list;
    }

    /**
     * 根据书籍id查询书籍
     */
    @Override
    public Book findBookById(Integer id) {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }

    /**
     * 查询最火的书籍标签
     */
    @Override
    public String topSort() {
        BookTagPojo topSort =  bookMapper.topSort();
        return  topSort.getSort();
    }

    /**
     * 查询最火标签下 评论数最多的10本书，降序排列
     */
    @Override
    public List<BookPojo> topBook(Integer num) {
        List<BookPojo> books = bookMapper.topBook(topSort(), num);
        return books;
    }


    /**
     * 查询最火标签下 评论数最多的10本书，降序排列
     */
    @Override
    public List<BookNewCommentPojo> topNBookNewComment(Integer id, Integer num){
        List<BookNewCommentPojo> bookcomments = bookMapper.topNBookNewComment(id,num);
        return bookcomments;
    }
}

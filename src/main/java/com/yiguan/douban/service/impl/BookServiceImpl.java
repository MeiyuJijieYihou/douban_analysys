package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.mapper.BookMapper;
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
 * @Author: Function
 * @Date: 2019/11/5 19:29
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> findAllBook() {
        List<Book> list = new ArrayList<>();
        list = bookMapper.selectAll();
        return list;
    }

    @Override
    public Book findBookById(Integer id) {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }

    @Override
    public String topSort() {
        BookTagPojo topSort =  bookMapper.topSort();
        return  topSort.getSort();
    }

    @Override
    public List<BookPojo> topTenBook(String topSort) {
        List<BookPojo> books = bookMapper.topTenBook(topSort);
        return books;
    }

    @Override
    public List<BookPojo> topBook(String topSort, Integer num) {
        List<BookPojo> books = bookMapper.topBook(topSort, num);
        return books;
    }
}

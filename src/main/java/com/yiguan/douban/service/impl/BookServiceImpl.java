package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.mapper.BookMapper;
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

}

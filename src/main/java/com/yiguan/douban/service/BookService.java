package com.yiguan.douban.service;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookPojo;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 付晓
 * @Date: 2019/11/5 19:29
 */
public interface BookService {

    /**
     * 查询所有书籍
     */
    public List<Book> findAllBook();

    /**
     * 根据书籍id查询书籍
     */
    public Book findBookById(Integer id);

    /**
     * 查询最火的书籍标签
     */
    public String topSort();
    
    /**
    *@Description: 最火类目书籍降序排行，排行数目由前端传入，默认为10
    */
    public List<BookPojo> topBook(String topSort, Integer num);

}

package com.yiguan.douban.service;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookPojo;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Function
 * @Date: 2019/11/5 19:29
 */
public interface BookService {

    public List<Book> findAllBook();

    public Book findBookById(Integer id);

    /**
     * 查询最火的书籍标签
     */
    public String topSort();

    /**
     * 查询最火标签下 评论数最多的10本书，降序排列
     */
    public List<BookPojo> topTenBook(String topSort);
    
    /**
    *@Author: NaiPan
    *@Description: 最火类目书籍降序排行，排行数目由前端传入，默认为10
    *@Param: 
    *@return:
    *@date: 2019/11/17
    */
    public List<BookPojo> topBook(String topSort, Integer num);
}

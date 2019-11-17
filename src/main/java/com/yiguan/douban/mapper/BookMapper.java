package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookPojo;
import com.yiguan.douban.pojo.BookTagPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookMapper
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 付晓
 * @Date: 2019/11/5 19:10
 */
public interface BookMapper extends Mapper<Book> {

    /**
     * 查询最火的书籍标签
     */
     BookTagPojo topSort();

    /**
     * 查询最火标签下 评论数最多的10本书，降序排列
     */
    List<BookPojo> topTenBook(String topSort);
    
    /**
    *@Author: NaiPan
    *@Description: 最火类目书籍降序排行，排行数目由前端传入，默认为10
    *@Param: 
    *@return: 
    *@date: 2019/11/17
    */
    List<BookPojo> topBook(String topSort, Integer num);

}

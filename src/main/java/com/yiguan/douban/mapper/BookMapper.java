package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookNewCommentPojo;
import com.yiguan.douban.pojo.BookPojo;
import com.yiguan.douban.pojo.BookTagPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookMapper
 * @Description: TODO(书籍相关查询Mapper)
 * @Author: 付晓
 * @Date: 2019/11/5 19:10
 */
public interface BookMapper extends Mapper<Book> {

    /**
     * 查询最火的书籍标签
     */
     BookTagPojo topSort();
    
    /**
    * 最火类目书籍降序排行，排行数目由前端传入，默认为10
    */
    List<BookPojo> topBook(String topSort, Integer num);

    /**
     * 根据id得到最新的N条书籍评论，N由前端传入，前端未传入则默认为10条
     */
    List<BookNewCommentPojo> topNBookNewComment(Integer id,Integer num);

}

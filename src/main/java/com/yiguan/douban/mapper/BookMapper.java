package com.yiguan.douban.mapper;

import com.yiguan.douban.entity.Book;
import com.yiguan.douban.pojo.BookGetUserIdPojo;
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
     * 查询最火的最受女性欢迎的书籍标签
     */
    BookTagPojo femaleSort();
    
    /**
    * 最火类目书籍降序排行，排行数目由前端传入，默认为10
    */
    List<BookPojo> topBook(String topSort, Integer num);

    /**
     * 根据id得到最新的N条书籍评论，N由前端传入，前端未传入则默认为10条
     */
    List<BookNewCommentPojo> topNBookNewComment(Integer id,Integer num);

    /**
     * 根据书籍的id找到所有评论，通过评论找到对应的用户id
     */
    List<BookGetUserIdPojo> getUserIdByComment(Long id);

    /**
     * 查到该本书的类别，并给该类别加上该书女评的数目
     * @return sort
     */
    void setSortFemaleNum(Long id, int num);
    String getFemaleSortLike();
}

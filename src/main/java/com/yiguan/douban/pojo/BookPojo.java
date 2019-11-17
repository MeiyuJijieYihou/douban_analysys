package com.yiguan.douban.pojo;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookController
 * @Description: TODO(该类用于返回 最火标签下评论数最多的10本书,还需要再Book表中增加一个简介字段，后面再改)
 * @Author: Function
 */
public class BookPojo {

    /**
     * 书的封面
     */
    private String cover;

    /**
     * 书名
     */
    private String name;

    /**
     * 书的作者
     */
    private String author;

    /**
     * 书的简介
     */
    private String introduction;



    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}

package com.yiguan.douban.entity;

import lombok.Data;

<<<<<<< HEAD
public class Book {

  private Long bookId;
  private String bookAuthor;
  private String bookPress;
  private String bookProducers;
  private String bookSubtitle;
  private String bookOriginalname;
  private String bookTranslator;
  private java.sql.Timestamp bookYear;
  private Long bookPages;
  private Long bookPricing;
  private String bookBinding;
  private String bookSeries;
  private String bookIsbn;
  private String bookCover;
  private String sort;

  public String getSort(){return sort;}

  public void setSort(String sort){
    this.sort = sort;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }


  public String getBookPress() {
    return bookPress;
  }

  public void setBookPress(String bookPress) {
    this.bookPress = bookPress;
  }


  public String getBookProducers() {
    return bookProducers;
  }

  public void setBookProducers(String bookProducers) {
    this.bookProducers = bookProducers;
  }


  public String getBookSubtitle() {
    return bookSubtitle;
  }

  public void setBookSubtitle(String bookSubtitle) {
    this.bookSubtitle = bookSubtitle;
  }


  public String getBookOriginalname() {
    return bookOriginalname;
  }

  public void setBookOriginalname(String bookOriginalname) {
    this.bookOriginalname = bookOriginalname;
  }


  public String getBookTranslator() {
    return bookTranslator;
  }
=======
import java.util.Date;
>>>>>>> 30cc31a5ef79bd012837eeaee735a4d54aedd71b

@Data
public class Book {

  /**
   * 书籍编号
   */
  private Long id;

  /**
   * 作者
   */
  private String author;

  /**
   * 书名
   */
  private String name;

  /**
   * 出版社
   */
  private String press;

  /**
   * 出品方
   */
  private String producers;

  /**
   * 副标题
   */
  private String subtitle;

  /**
   * 原作名
   */
  private String originalname;

  /**
   * 译者
   */
  private String translator;

  /**
   * 出版年
   */
  private Date year;

  /**
   * 页数
   */
  private Long pages;

  /**
   * 定价
   */
  private Long pricing;

  /**
   * 装帧
   */
  private String binding;

  /**
   * 丛书
   */
  private String series;

  /**
   * ISBN
   */
  private String isbn;

  /**
   * 封面
   */
  private String cover;

  /**
   * 标签
   */
  private String sort;

}

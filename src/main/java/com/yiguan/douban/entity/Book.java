package com.yiguan.douban.entity;

import lombok.Data;


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

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
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
}



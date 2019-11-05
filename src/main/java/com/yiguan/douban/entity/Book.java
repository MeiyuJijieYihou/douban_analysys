package com.yiguan.douban.entity;


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

  public void setBookTranslator(String bookTranslator) {
    this.bookTranslator = bookTranslator;
  }


  public java.sql.Timestamp getBookYear() {
    return bookYear;
  }

  public void setBookYear(java.sql.Timestamp bookYear) {
    this.bookYear = bookYear;
  }


  public long getBookPages() {
    return bookPages;
  }

  public void setBookPages(long bookPages) {
    this.bookPages = bookPages;
  }


  public long getBookPricing() {
    return bookPricing;
  }

  public void setBookPricing(long bookPricing) {
    this.bookPricing = bookPricing;
  }


  public String getBookBinding() {
    return bookBinding;
  }

  public void setBookBinding(String bookBinding) {
    this.bookBinding = bookBinding;
  }


  public String getBookSeries() {
    return bookSeries;
  }

  public void setBookSeries(String bookSeries) {
    this.bookSeries = bookSeries;
  }


  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }


  public String getBookCover() {
    return bookCover;
  }

  public void setBookCover(String bookCover) {
    this.bookCover = bookCover;
  }

}

package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Book {

  /**
   * 书籍id
   */
  @Id
  private long id;

  /**
   * 书名
   */
  private String name;

  /**
   * 书的作者
   */
  private String author;

  /**
   * 书出版社
   */
  private String press;

  /**
   * 书的出品方(投资方)
   */
  private String producers;

  /**
   * 书的副标题
   */
  private String subtitle;

  /**
   * 书的原作名
   */
  private String originalname;

  /**
   * 书的译者
   */
  private String translator;

  /**
   * 书的出版年
   */
  private java.sql.Timestamp year;

  /**
   * 书的页数
   */
  private long pages;

  /**
   * 书的定价
   */
  private float pricing;

  /**
   * 书的装帧
   */
  private String binding;

  /**
   * 书的丛书系列
   */
  private String series;

  /**
   * 书的isbn
   */
  private String isbn;

  /**
   * 书的封面
   */
  private String cover;

  /**
   * 书的标签
   */
  private String sort;

  /**
   * 书的评分
   */
  private double grade;

  /**
   * 书的评价人数
   */
  private long number;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public String getProducers() {
    return producers;
  }

  public void setProducers(String producers) {
    this.producers = producers;
  }


  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public String getOriginalname() {
    return originalname;
  }

  public void setOriginalname(String originalname) {
    this.originalname = originalname;
  }


  public String getTranslator() {
    return translator;
  }

  public void setTranslator(String translator) {
    this.translator = translator;
  }


  public java.sql.Timestamp getYear() {
    return year;
  }

  public void setYear(java.sql.Timestamp year) {
    this.year = year;
  }


  public long getPages() {
    return pages;
  }

  public void setPages(long pages) {
    this.pages = pages;
  }


  public float getPricing() {
    return pricing;
  }

  public void setPricing(float pricing) {
    this.pricing = pricing;
  }


  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }


  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }


  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }


  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }


  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

}

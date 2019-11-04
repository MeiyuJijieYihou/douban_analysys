package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Music {

  private long id;
  private String coverUrl;
  private String name;
  private String singer;
  private long playTimes;
  private long status;
  private long listDays;
  private String style;
  private java.sql.Date issueDate;
  private String publisher;
  private long songNumbers;
  private String barcode;
  private String introduction;
  private String track;

}

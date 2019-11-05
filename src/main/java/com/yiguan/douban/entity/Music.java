package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class Music {

  private Long id;
  private String coverUrl;
  private String name;
  private String singer;
  private Long playTimes;
  private Long status;
  private Long listDays;
  private String style;
  private java.sql.Date issueDate;
  private String publisher;
  private Long songNumbers;
  private String barcode;
  private String introduction;
  private String track;

}

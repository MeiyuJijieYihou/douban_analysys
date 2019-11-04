package com.sample;

import lombok.Data;

@Data
public class Movie {

  private long mid;
  private String name;
  private String director;
  private String screenwriter;
  private String starring;
  private String type;
  private String countriesRegions;
  private String language;
  private java.sql.Timestamp date;
  private long length;
  private String otherName;
  private String imDb;
  private long shortCommentNumber;
  private long commentNumber;
  private double score;

}

package com.sample;

import lombok.Data;

@Data
public class Movie {

  private Long mid;
  private String name;
  private String director;
  private String screenwriter;
  private String starring;
  private String type;
  private String countriesRegions;
  private String language;
  private java.sql.Timestamp date;
  private Long length;
  private String otherName;
  private String imDb;
  private Long shortCommentNumber;
  private Long commentNumber;
  private Double score;

}

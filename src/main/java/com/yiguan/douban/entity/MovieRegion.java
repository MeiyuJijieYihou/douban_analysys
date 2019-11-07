package com.yiguan.douban.entity;

import lombok.Data;

@Data
public class MovieRegion {

  /**
   * 电影编号
   */
  private long movieId;

  /**
   * 地区编号
   */
  private long regionId;

}

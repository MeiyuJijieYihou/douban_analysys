package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("电影-地区中间表")
@Data
public class MovieRegion {

  /**
   * 电影编号
   */
  @ApiModelProperty("电影id")
  private Long movieId;

  /**
   * 地区编号
   */
  @ApiModelProperty("地区id")
  private Long regionId;

}

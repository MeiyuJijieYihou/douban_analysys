package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 电影-地区类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/17 14:31
 * @since JDK 1.8
 */
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

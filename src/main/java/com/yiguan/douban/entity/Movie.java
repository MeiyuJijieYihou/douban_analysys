package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel("电影")
@Data
public class Movie {

  /**
   * 电影id
   */
  @Id
  @ApiModelProperty("电影id")
  private Long id;

  /**
   * 电影名称
   */
  @ApiModelProperty("电影名称")
  private String name;

  /**
   * 导演
   */
  @ApiModelProperty("导演")
  private String director;

  /**
   * 编剧
   */
  @ApiModelProperty("编剧")
  private String screenwriter;

  /**
   * 主演
   */
  @ApiModelProperty("主演")
  private String starring;

  /**
   * 类型
   */
  @ApiModelProperty("电影类型")
  private String type;

  /**
   * 语言
   */
  @ApiModelProperty("电影语言")
  private String language;

  /**
   * 上映日期
   */
  @ApiModelProperty("上映日期")
  private String date;

  /**
   * 片长
   */

  @ApiModelProperty("片长")
  private Long length;

  /**
   * 又名
   */
  @ApiModelProperty("电影别名")
  private String otherName;

  /**
   * IMDb
   */
  @ApiModelProperty("IMDb")
  private String imDb;

  /**
   * 短评数量
   */
  @ApiModelProperty("短评数量")
  private Long shortCommentNumber;

  /**
   * 影评数量
   */
  @ApiModelProperty("影评数量")
  private Long commentNumber;

  /**
   * 豆瓣评分
   */
  @ApiModelProperty("豆瓣评分")
  private Double score;

  /**
   * 评分人数
   */
  @ApiModelProperty("评分人数")
  private Integer scoreNumber;

}

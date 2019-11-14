package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("评论")
@Data
public class Comment {

  /**
   * 评论id
   */
  @ApiModelProperty("评论id")
  private Long id;

  /**
   * 类型（电影、书籍、音乐）
   */
  @ApiModelProperty("评论类型")
  private Long type;

  /**
   * 副类型（短评/长评）
   */
  @ApiModelProperty("评论副类型")
  private Long subtype;


  /**
   * 是否看过（电影短评细分，其他无)
   */
  @ApiModelProperty("电影短评中“是否看过”选项")
  private Long seen;

  /**
   * 评价（星）
   */
  @ApiModelProperty("评价（星）")
  private Long star;

  /**
   * 评论日期
   */
  @ApiModelProperty("评论日期")
  private Date date;

  /**
   * 标题（长评）
   */
  @ApiModelProperty("影评标题")
  private String title;

  /**
   * 评论内容
   */
  @ApiModelProperty("评论内容")
  private String content;

  /**
   * 有用数量
   */
  @ApiModelProperty("有用数量")
  private Long usefulNumber;

  /**
   * 没用数量（长评）
   */
  @ApiModelProperty("没用数量（长评）")
  private Long uselessNumber;

  /**
   * 目标id（电影id、书籍id、音乐id）
   */
  @ApiModelProperty("目标id（电影id、书籍id、音乐id）")
  private Long targetId;

  /**
   * 评论用户id
   */
  @ApiModelProperty("评论用户id")
  private String userId;

}

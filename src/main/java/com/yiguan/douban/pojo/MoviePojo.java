package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Description: MoviePojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/12 19:44
 * @since JDK 1.8
 */
@ApiModel("电影Pojo")
@Data
public class MoviePojo {

    /**
     * 电影id
     */
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
     * 制片国家/地区
     */
    @ApiModelProperty("制片国家/地区")
    private List<String> countriesRegions;

    /**
     * 上映日期
     */
    @ApiModelProperty("上映日期")
    private String date;

    /**
     * 豆瓣评分
     */
    @ApiModelProperty("豆瓣评分")
    private Double score;

    /**
     * 电影封面url
     */
    @ApiModelProperty("电影封面url")
    private String coverUrl;

}

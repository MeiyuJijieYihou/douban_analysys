package com.yiguan.douban.pojo;

import lombok.Data;

import java.util.List;

/**
 * Description: MoviePojo
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/12 下午7:44
 * @since JDK 1.8
 */
@Data
public class MoviePojo {

    /**
     * 电影编号
     */
    private Long id;

    /**
     * 电影名称
     */
    private String name;

    /**
     * 导演
     */
    private String director;

    /**
     * 编剧
     */
    private String screenwriter;

    /**
     * 主演
     */
    private String starring;

    /**
     * 类型
     */
    private String type;

    /**
     * 制片国家/地区
     */
    private List<String> countriesRegions;

    /**
     * 语言
     */
    private String language;

    /**
     * 上映日期
     */
    private String date;

    /**
     * 片长
     */
    private Long length;

    /**
     * 又名
     */
    private String otherName;

    /**
     * IMDb
     */
    private String imDb;

    /**
     * 短评数量
     */
    private Long shortCommentNumber;

    /**
     * 影评数量
     */
    private Long commentNumber;

    /**
     * 豆瓣评分
     */
    private Double score;

    /**
     * 评分人数
     */
    private Integer scoreNumber;
}

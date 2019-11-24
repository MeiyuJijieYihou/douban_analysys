package com.yiguan.douban.entity;

import javax.persistence.Id;

/**
 * Description: 权限类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/23 19:30
 * @since JDK 1.8
 */
public class SysPermission {

    @Id
    private Long id;

    private String name;

    private String url;

    private String description;
}

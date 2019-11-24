package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;

/**
 * Description: 角色类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 21:22
 * @since JDK 1.8
 */
@Data
public class SysRole {

    @Id
    private Long id;

    private String name;

    private List<SysPermission> permissions;

}
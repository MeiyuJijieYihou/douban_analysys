package com.yiguan.douban.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;

/**
 * Description: 用户类
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/11/22 21:23
 * @since JDK 1.8
 */
@Data
public class SysUser {

    @Id
    private Long id;

    private String username;

    private String password;

    private List<SysRole> roles;

}

package com.yiguan.douban.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("登录用户")
@Data
public class SysUser {

    /**
     * 用户id
     */
    @Id
    @ApiModelProperty("用户id")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 角色
     */
    @ApiModelProperty("角色")
    private List<SysRole> roles;

}

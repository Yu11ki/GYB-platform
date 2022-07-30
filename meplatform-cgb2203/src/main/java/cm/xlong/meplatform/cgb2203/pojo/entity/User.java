package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id",required = true)
    private Long id;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称",required = true)
    private String username;
    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码",required = true)
    private String password;
    /**
     * 头像图片
     */
    @ApiModelProperty(value = "头像图片",required = true)
     private String picture;
    /**
     * 是否为商家
     */
    @ApiModelProperty(value = "是否为商家",required = true)
    private boolean isPromulgator;
}

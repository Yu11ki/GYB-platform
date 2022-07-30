package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户详细信息
 */
@Data
public class UserDetail implements Serializable {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id",required = true)
    private Long userId;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号",required = true)
    private String phone;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址",required = true)
    private String address;
    /**
     * 信用分
     */
    @ApiModelProperty(value = " 信用分",required = true)
    private int credit;
}

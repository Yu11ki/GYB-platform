package cm.xlong.meplatform.cgb2203.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * 用户信息DTO
 */
@Data
public class UserDTO implements Serializable {
    /**
     * 用户id
     */
    @ApiModelProperty(value ="用户ID",required = true)
    private Long id;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称",required = true)
    private String username;
    /**
     * 用户密码
     */
    @ApiModelProperty(value ="用户密码",required = true)
    private String password;
    /**
     * 是否为商家
     */
    @ApiModelProperty(value = "是否为商家",required = true)
    private boolean isPromulgator;
}



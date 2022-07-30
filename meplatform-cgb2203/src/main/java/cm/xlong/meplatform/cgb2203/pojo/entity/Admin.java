package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 管理员信息
 */
import java.io.Serializable;

@Data
public class Admin implements Serializable {
    /**
     * 管理员id
     */
    @ApiModelProperty(value = "管理员id",required = true)
    private Long id;
    /**
     *管理员名称
     */
    @ApiModelProperty(value = "管理员名称",required = true)
    private String adminName;
    /**
     * 管理员密码
     */
    @ApiModelProperty(value = "管理员密码",required = true)
    private String adminPw;
    /**
     *管理员角色
     */
    @ApiModelProperty(value = "管理员角色",required = true)
    private Integer role;

}

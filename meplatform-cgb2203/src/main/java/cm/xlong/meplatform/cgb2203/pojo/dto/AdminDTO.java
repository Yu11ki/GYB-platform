package cm.xlong.meplatform.cgb2203.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * 管理员信息
 */
@Data
public class AdminDTO implements Serializable {
    /**
     * 管理员id
     */
    @ApiModelProperty(value = "管理员id",required = true)
    private Long adminId;
    /**
     *管理员名称
     */
    @ApiModelProperty(value = "管理员名称",required = true)
    private String adminName;
    /**
     * 管理员密码
     */
    @ApiModelProperty(value = "管理员密码",required = true)
    private String adminPW;
}

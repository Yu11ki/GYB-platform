package cm.xlong.meplatform.cgb2203.pojo.entity;
/**
 *系统管理员角色
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class AdminRole implements Serializable {
    /**
     * 管理员ID
     */
    @ApiModelProperty(value = "管理员ID",required = true)
    private Long adminId;
    /**
     * 系统管理员
     */
    @ApiModelProperty(value = "系统管理员",required = true)
    private Integer root;
    /**
     * 财务管理员
     */
    @ApiModelProperty(value = "财务管理员",required = true)
    private Integer adminFinance;
    /**
     * 审核管理员
     */
    @ApiModelProperty(value = "审核管理员",required = true)
    private Integer adminCherker;
}

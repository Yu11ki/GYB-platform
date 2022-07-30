package cm.xlong.meplatform.cgb2203.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

@Data
public class AdminLoginVO implements Serializable {
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
    private Integer adminChecker;
}

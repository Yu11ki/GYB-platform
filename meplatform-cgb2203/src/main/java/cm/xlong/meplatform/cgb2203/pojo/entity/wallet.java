package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 钱包
 */
@Data
public class wallet implements Serializable {
    /**
     * 钱包ID
     */
    @ApiModelProperty(value = "钱包ID",required = true)
    private Long id;
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID",required = true)
    private Long userId;
    /**
     * 金额
     */
    @ApiModelProperty(value = "金额",required = true)
    private Double money;

}

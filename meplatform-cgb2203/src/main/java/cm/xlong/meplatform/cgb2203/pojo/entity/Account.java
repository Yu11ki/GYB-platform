package cm.xlong.meplatform.cgb2203.pojo.entity;
/**
 *资金流水
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Account implements Serializable {
    /**
     * 流水账单ID
     */
    @ApiModelProperty(value = "流水账单ID",required = true)
    private Long id;

    /**
     * 交易金额
     */
    @ApiModelProperty(value = "交易金额",required = true)
    private Double transactionAmount;
    /**
     * 交易时间
     */
    @ApiModelProperty(value = "交易时间",required = true)
    private LocalDateTime time;
    /**
     * 任务表ID
     */
    @ApiModelProperty(value = "任务表ID",required = true)
    private Integer detailId;
}

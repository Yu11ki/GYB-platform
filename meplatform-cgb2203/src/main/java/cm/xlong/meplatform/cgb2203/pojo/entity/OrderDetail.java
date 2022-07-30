package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 任务单细节
 */
@Data
public class OrderDetail implements Serializable {
    /**
     * 任务ID
     */
    @ApiModelProperty(value = " 任务ID",required = true)
    private Long orderId;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = " 创建时间",required = true)
    private LocalDateTime createTime;
    /**
     * 是否接单
     */
    @ApiModelProperty(value = " 是否接单",required = true)
    private Boolean isAccept;
    /**
     * 是否完成
     */
    @ApiModelProperty(value = " 是否完成",required = true)
    private Boolean isFinish;
    /**
     * 是否验收
     */
    @ApiModelProperty(value = " 是否验收",required = true)
    private Boolean isAcceptance;
    /**
     * 是否撤单
     */
    @ApiModelProperty(value = "是否撤单",required = true)
    private Boolean isDelete;
}

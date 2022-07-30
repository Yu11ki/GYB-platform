package cm.xlong.meplatform.cgb2203.pojo.entity;
/**
 * 佣兵与任务中间表
 */

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrderUser implements Serializable {
    /**
     * 佣兵与任务id
     */
    @ApiModelProperty(value = " 佣兵与任务id",required = true)
    private Long id;
    /**
     * 接单id
     */
    @ApiModelProperty(value = " 接单id",required = true)
    private Long userId;
    /**
     * 任务id
     */
    @ApiModelProperty(value = " 任务id",required = true)
    private Long orderId;
    /**
     * 接单时间
     */
    @ApiModelProperty(value = "接单时间",required = true)
    private LocalDateTime createTime;
}

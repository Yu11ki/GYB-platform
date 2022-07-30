package cm.xlong.meplatform.cgb2203.pojo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 任务单评价
 */
public class Comment implements Serializable {
    /**
     * 评价表id
     */
    @ApiModelProperty(value = " 评价表id",required = true)
    private Long id;
    /**
     * 任务单id
     */
    @ApiModelProperty(value = " 任务单id",required = true)
    private Long orderId;
    /**
     * 使用时间
     */
    @ApiModelProperty(value = " 使用时间",required = true)
    private LocalDateTime useTime;
    /**
     * 评价
     */
    @ApiModelProperty(value = " 评价",required = true)
    private String comment;

}

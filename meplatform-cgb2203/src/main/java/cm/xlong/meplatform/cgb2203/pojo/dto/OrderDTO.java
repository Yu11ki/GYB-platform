package cm.xlong.meplatform.cgb2203.pojo.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 任务单发布DTO
 */
public class OrderDTO implements Serializable {
    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id",required = true)
    private Long orderId;
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id",required = true)
    private Long userId;
    /**
     * 订单图片
     */
    @ApiModelProperty(value = "订单图片",required = true)
    private String picture;
    /**
     * 佣金金额
     */
    @ApiModelProperty(value = "佣金金额",required = true)
    private Double reward;
    /**
     * 订单详情描述
     */
    @ApiModelProperty(value = "订单详情描述",required = true)
    private String description;
    /**
     * 订单截至时间
     */
    @ApiModelProperty(value = "订单截至时间",required = true)
    private LocalDateTime time;
    /**
     * 接单人数
     */
    @ApiModelProperty(value = "接单人数",required = true)
    private Integer number;
}

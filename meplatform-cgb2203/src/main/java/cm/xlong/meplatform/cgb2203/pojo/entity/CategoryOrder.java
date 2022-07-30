package cm.xlong.meplatform.cgb2203.pojo.entity;
/**
 * 类别与任务关联
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryOrder implements Serializable {
    /**
     *用户ID
     */
    @ApiModelProperty(value = "用户id",required = true)
    private Long id;
    /**
     * 类别id
     */
    @ApiModelProperty(value = " 类别id",required = true)
    private Long categoryId;
    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id",required = true)
    private Long detailId;

}

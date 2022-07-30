package cm.xlong.meplatform.cgb2203.pojo.entity;
/**
 * 类别信息
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
public class Category implements Serializable {
    /**
     * 类型id
     */
    @ApiModelProperty(value = "类型id",required = true)
    private Long id;
    /**
     * 类型名称
     */
    @ApiModelProperty(value = "类型名称",required = true)
    private String username;
    /**
     * 父类id
     */
    @ApiModelProperty(value = "父类id",required = true)
    private Long parentId;
    /**
     * 任务分类等级
     */
    @ApiModelProperty(value = "任务分类等级",required = true)
    private int level;
}

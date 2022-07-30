package cm.xlong.meplatform.cgb2203.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
/**
 * 类别DTO信息
 */

@Data
public class CategoryDTO implements Serializable {
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
    @ApiModelProperty(value = "",required = true)
    private int level;
}

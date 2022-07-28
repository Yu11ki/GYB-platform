package cm.xlong.meplatform.cgb2203.restful;



import cm.xlong.meplatform.cgb2203.exception.ServiceException;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;



/**
 * 通用响应对象
 */
@Data
public class JsonResult<T> implements Serializable {

    /**
     * 状态码
     */
    @ApiModelProperty(value = "业务状态码", position = 1, example = "200, 400, 401, 403, 404, 409, 500")
    private Integer state;
    /**
     * 消息
     */
    @ApiModelProperty(value = "业务消息", position = 2, example = "登录失败！密码错误！")
    private String message;
    /**
     * 数据
     */
    @ApiModelProperty(value = "业务数据", position = 3)
    private T data;

    /**
     * 创建响应结果对象，表示"成功"，不封装其它任何数据
     * @return 响应结果对象
     */
    public static JsonResult<Void> ok() {
        return ok("OK");
    }

    public static JsonResult ok(String message){
        JsonResult jsonResult=new JsonResult();
        jsonResult.setState(ResponseCode.OK.getValue());
        jsonResult.setMessage(message);
        jsonResult.setData(null);
        return jsonResult;
    }
    /**
     * 创建响应结果对象，表示"成功"，且封装客户端期望响应的数据
     * @param data 客户端期望响应的数据
     * @return 响应结果对象
     */
    public static <T> JsonResult<T> ok(String message,T data) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setState(ResponseCode.OK.getValue());
        jsonResult.setData(data);
        jsonResult.setMessage(message);
        return jsonResult;
    }

    /**
     *失败时返回的失败提示消息和状态码
     * @param message   返回消息
     * @param serviceCode 状态代码
     * @return
     */
    public static JsonResult fail(String message,Integer serviceCode){
        JsonResult jsonResult = new JsonResult();
        jsonResult.message=message;
        jsonResult.state=serviceCode;
        return jsonResult;
    }

    /**
     * 全局异常返回的失败信息,调用上面的fail的方法以简化方法
     * @param e 全局异常
     * @return
     */
    public static JsonResult fail(ServiceException e){
        return fail(e.getMessage(),e.getServiceCode());
    }


}

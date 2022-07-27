package cm.xlong.meplatform.cgb2203.restful;

/**
 * 代码枚举类型
 */
public enum ResponseCode {
    //成功状态码
    OK(200),

    //运行失败状态代码
    BAD_REQUEST(400),

    //资源路径设置错误,未找到状态代码
    NOT_FOUND(404);

    //设置状态代码value值,通过公有get,set方法进行访问修改私有值
    private Integer value;

    ResponseCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

}

package cm.xlong.meplatform.cgb2203.exception;

public class ServiceException extends RuntimeException{

    private Integer serviceCode;
    //返回异常状态码跟提示信息
    public ServiceException(String message,Integer serviceCode) {
        super(message);
        this.serviceCode=serviceCode;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }
}

package cm.xlong.meplatform.cgb2203.exception.handler;

import cm.xlong.meplatform.cgb2203.exception.ServiceException;
import cm.xlong.meplatform.cgb2203.restful.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    public GlobalExceptionHandler() {
        log.info("创建统一处理异常的对象：GlobalExceptionHandler");
    }
    @ExceptionHandler
    public JsonResult handlerServiceException(ServiceException e){
        log.info("统一处理异常{}",e.getMessage());
        return JsonResult.fail(e);
    }
}

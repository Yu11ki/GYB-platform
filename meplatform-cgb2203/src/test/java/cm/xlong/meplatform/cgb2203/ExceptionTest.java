package cm.xlong.meplatform.cgb2203;

import cm.xlong.meplatform.cgb2203.exception.ServiceException;
import cm.xlong.meplatform.cgb2203.restful.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
public class ExceptionTest {
    @Test
    public void testException(){
        log.info("开始测试全局异常");
        if(0.6>0.5){
            String message="测试全局异常";
            throw new ServiceException(message, ResponseCode.BAD_REQUEST.getValue());
        }
        log.info("测试结束");
    }
}

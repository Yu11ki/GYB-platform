package cm.xlong.meplatform.cgb2203;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
//数据库employ测试连接
@SpringBootTest
@Slf4j
public class MySqlConnectTest {
    @Autowired
    private DataSource dataSource;
    @Test
    public void testConnect() throws SQLException {
        log.info("尝试连接");
        dataSource.getConnection();
        log.info("连接成功");
    }
}

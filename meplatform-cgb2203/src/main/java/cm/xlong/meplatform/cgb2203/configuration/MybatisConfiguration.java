package cm.xlong.meplatform.cgb2203.configuration;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Configuration
@MapperScan("cm.xlong.meplatform.cgb2203.mapper")
public class MybatisConfiguration {

    public MybatisConfiguration() {
        log.debug("加载配置类：MybatisConfiguration");
    }

}
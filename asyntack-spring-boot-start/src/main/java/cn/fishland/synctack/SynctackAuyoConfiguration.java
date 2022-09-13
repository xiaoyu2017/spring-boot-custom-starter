package cn.fishland.synctack;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author xiaoyu
 * @version 1.0
 */
@Configuration
@EnableConfigurationProperties(SyncTackProperties.class)
public class SynctackAuyoConfiguration {

    @Bean
    public SyncTack createRunnable() {
        return new SyncTack("fish", 1);
    }

}

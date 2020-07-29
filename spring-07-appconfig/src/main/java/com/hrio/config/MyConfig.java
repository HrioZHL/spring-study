package com.hrio.config;

import com.hrio.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // 代表这是一个配置类，和xml一样的
@ComponentScan("com.hrio.pojo")
@Import(MyConfig01.class)
public class MyConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}

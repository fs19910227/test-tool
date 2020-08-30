package com.fs.test.generate.data.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

/**
 * 基本配置
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:07
 */
@Configuration
public class Config {
    @Bean
    public Faker faker() {
        return new Faker(Locale.SIMPLIFIED_CHINESE);
    }
}

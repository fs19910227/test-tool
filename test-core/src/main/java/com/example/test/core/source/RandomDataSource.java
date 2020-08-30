package com.example.test.core.source;

import com.github.javafaker.Faker;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 随机数据源
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:23
 */
@Component
public class RandomDataSource implements InitializingBean {
    @Getter
    private Faker faker;

    @Override
    public void afterPropertiesSet() throws Exception {
        faker = new Faker(Locale.SIMPLIFIED_CHINESE);
    }
}

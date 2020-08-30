package com.fs.test.generate.data.source.internal;

import com.fs.test.generate.data.source.InfiniteDataSource;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * fake日期数据源
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 21:55
 */
@Component
public class FakeDateSource implements InfiniteDataSource<Date> {
    /**
     * 日期数据产生器
     */
    private DateAndTime faker;

    public FakeDateSource(@Autowired Faker faker) {
        this.faker = faker.date();
    }

    @Override
    public Date next() {
        return faker.birthday();
    }

}

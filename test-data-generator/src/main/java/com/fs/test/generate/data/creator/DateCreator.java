package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.source.DataSource;
import com.fs.test.generate.data.strategy.Strategy;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;

import java.util.Date;

/**
 * 日期数据生成器
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:04
 */
public class DateCreator implements FakeDataCreator<Date> {

    private DateAndTime faker;


    @Override
    public void init(Faker faker) {
        this.faker = faker.date();
    }

    @Override
    public Date fetchData(Strategy strategy) {
        return faker.birthday();
    }

    @Override
    public void setDataSource(DataSource<Date> dataSource) {

    }
}

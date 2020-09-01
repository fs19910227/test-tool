package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.strategy.Strategy;
import com.github.javafaker.Faker;
import com.github.javafaker.Number;

/**
 * long型数据生成器
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:04
 */
public class LongCreator implements FakeDataCreator<Long> {

    private Number faker;


    @Override
    public void init(Faker faker) {
        this.faker = faker.number();
    }

    @Override
    public Long fetchData(Strategy strategy) {
        return faker.randomNumber();
    }


}

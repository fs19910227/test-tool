package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.strategy.Strategy;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

/**
 * name 生成
 * string 型数据生成器
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:04
 */
public class NameCreator implements FakeDataCreator<String> {

    private Name faker;

    @Override
    public void init(Faker faker) {
        this.faker = faker.name();
    }

    @Override
    public String fetchData(Strategy strategy) {
        return faker.fullName();
    }


}

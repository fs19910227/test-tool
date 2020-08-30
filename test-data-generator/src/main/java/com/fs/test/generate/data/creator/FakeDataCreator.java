package com.fs.test.generate.data.creator;

import com.github.javafaker.Faker;

/**
 * fake 数据产生器
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:10
 */
public interface FakeDataCreator<T> extends DataCreator<T> {
    /**
     * 设置faker
     *
     * @param faker faker
     */
    void init(Faker faker);
}

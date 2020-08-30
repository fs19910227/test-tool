package com.example.test.core.source;

/**
 * 单条数据
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:20
 */
public interface Data<T> {
    /**
     * 获取数据实体
     *
     * @return 数据实体
     */
    T getEntity();
}

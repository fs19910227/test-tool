package com.example.test.core.source;

/**
 * 数据源
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:20
 */
public interface DataSource<T> {
    /**
     * 获取一条数据
     *
     * @return 一条数据
     */
    Data<T> fetchOne();
}

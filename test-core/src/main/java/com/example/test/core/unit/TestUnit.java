package com.example.test.core.unit;

import com.example.test.core.result.DataResult;
import com.example.test.core.source.DataSource;

import java.util.List;

/**
 * 测试单元
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:59
 */
public interface TestUnit {
    /**
     * 准备数据
     *
     * @param dataSource 数据源
     */
    void prepareData(DataSource dataSource);

    /**
     * 执行测试单元
     *
     * @return 单元结果数据
     */
    DataResult execute();

    /**
     * 获取下游单元
     *
     * @return 下游测试单元
     */
    TestUnit getDownstream();

    /**
     * 获取上游单元list
     *
     * @return 上游测试单元List
     */
    List<TestUnit> getUpstreams();
}

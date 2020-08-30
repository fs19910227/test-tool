package com.example.test.core.result;

import com.example.test.core.source.DataSource;

/**
 * 数据结果集
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:56
 */
public interface DataResult {
    /**
     * 结果转化为数据源
     *
     * @return
     */
    DataSource toDataSource();
}

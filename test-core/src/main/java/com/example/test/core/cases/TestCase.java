package com.example.test.core.cases;

import com.example.test.core.result.DataResult;
import com.example.test.core.source.DataSource;

/**
 * 测试用例
 *
 * @author zhaofushan
 * @date 2020/8/24 0024 21:54
 */
public interface TestCase {
    /**
     * 执行用例
     *
     * @param dataSource 数据源
     * @return 结果集
     */
    DataResult execute(DataSource dataSource);
}

package com.fs.test.generate.data.source;

/**
 * 无限数据源
 * 可以产生数据
 *
 * @param <T> 数据源所产生的类型
 * @author zhaofushan
 * @date 2020/8/28 0028 21:46
 */

public interface InfiniteDataSource<T> extends DataSource<T> {
    /**
     * 获取下一条数据
     *
     * @return
     */
    T next();
}

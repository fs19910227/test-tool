package com.fs.test.generate.data.source;

/**
 * 有限数据源
 * <p>
 * 可以产生数据
 *
 * @param <T> 数据源所产生的类型
 * @author zhaofushan
 * @date 2020/8/28 0028 21:46
 */

public interface LimitedDataSource<T> extends DataSource<T>, Iterable<T> {
    /**
     * 数据数量
     *
     * @return size
     */
    long size();
}

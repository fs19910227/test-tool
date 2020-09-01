package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.strategy.Strategy;

/**
 * 数据产生器
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:00
 */
public interface DataCreator<T> {
    /**
     * 根据策略获取数据
     *
     * @param strategy 数据获取策略
     * @return
     */
    T fetchData(Strategy strategy);


}

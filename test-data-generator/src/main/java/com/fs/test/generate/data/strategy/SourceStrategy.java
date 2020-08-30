package com.fs.test.generate.data.strategy;

/**
 * 数据源策略
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 21:57
 */
public enum SourceStrategy {
    /**
     * 内部fake数据源
     */
    FAKE,
    /**
     * 指定数据
     */
    ASSIGN,
    /**
     * 枚举
     */
    ENUM,
    /**
     * 自定义
     */
    CUSTOM

}

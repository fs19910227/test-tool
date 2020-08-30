package com.fs.test.generate.data.annotation.base;

import com.fs.test.generate.data.creator.DataCreator;
import com.fs.test.generate.data.creator.JsonDataCreator;
import com.fs.test.generate.data.source.DataSource;
import com.fs.test.generate.data.strategy.GenerateStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * json数据
 *
 * @author zhaofushan
 * @date 2020/8/30 0030 23:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JsonData {
    /**
     * 数据产生器
     *
     * @return 数据产生器
     */
    Class<? extends DataCreator> creator() default JsonDataCreator.class;

    /**
     * 数据源
     * <p>
     * 默认为空
     *
     * @return 数据源
     */
    Class<? extends DataSource> source();


    /**
     * 生成策略
     * RANDOM 随机取数据
     * SEQUENCE 按顺序取 对于随机源没有意义
     *
     * @return 生成策略
     */
    GenerateStrategy generateStrategy() default GenerateStrategy.RANDOM;
}

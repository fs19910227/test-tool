package com.fs.test.generate.data.annotation;

import com.fs.test.generate.data.creator.DataCreator;
import com.fs.test.generate.data.creator.NameCreator;
import com.fs.test.generate.data.strategy.GenerateStrategy;
import com.fs.test.generate.data.strategy.SourceStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字符串生成策略
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StringStrategy {
    /**
     * 来源策略
     * FAKE 使用内部随机数据源
     * ENUM 通过enums指定
     * ASSIGN 指定数据，需要通过 data属性填充
     * CUSTOM 自定义生成策略 需要指定自定义的数据生成器
     *
     * @return 数据源策略
     */
    SourceStrategy sourceStrategy() default SourceStrategy.FAKE;

    /**
     * 生成策略
     * RANDOM 随机取数据
     * SEQUENCE 按顺序取 对于随机源没有意义
     *
     * @return 生成策略
     */
    GenerateStrategy generateStrategy() default GenerateStrategy.RANDOM;

    /**
     * 使用 ASSIGN 策略，可以在这里指定数据
     *
     * @return long 数组
     */
    String[] data() default {};

    /**
     * 字符创枚举
     * 默认取name
     *
     * @return
     */
    Class<? extends Enum> enums() default Enum.class;


    /**
     * 数据产生器
     *
     * @return 数据产生器
     */
    Class<? extends DataCreator> creator() default NameCreator.class;
}

package com.fs.test.generate.data.annotation.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * long 数字数据范围
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:49
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LongRange {

    long start() default Long.MIN_VALUE;

    long end() default Long.MAX_VALUE;
}

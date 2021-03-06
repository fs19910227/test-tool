package com.fs.test.generate.data.annotation.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * int数字数据范围
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:49
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface IntRange {
    int start() default Integer.MIN_VALUE;

    int end() default Integer.MAX_VALUE;
}

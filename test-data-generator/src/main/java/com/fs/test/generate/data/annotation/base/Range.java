package com.fs.test.generate.data.annotation.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 数据范围
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:49
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    String start();

    String end();
}

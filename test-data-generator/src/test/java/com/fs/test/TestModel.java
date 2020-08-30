package com.fs.test;

import com.fs.test.generate.data.annotation.base.JsonData;
import com.fs.test.generate.data.source.EmptyDataSource;

import java.util.Date;

/**
 * 测试数据模型
 *
 * @author zhaofushan
 * @date 2020/8/28 0028 22:22
 */
@JsonData(source = EmptyDataSource.class)
public class TestModel {
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}

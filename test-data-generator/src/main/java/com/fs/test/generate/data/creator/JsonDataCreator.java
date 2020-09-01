package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.source.DataSource;

/**
 * json数据创建器
 *
 * @author zhaofushan
 * @date 2020/8/31 0031 0:21
 */
public class JsonDataCreator<T> extends BaseDataCreatorWithSource<T> {

    public JsonDataCreator(DataSource<T> source) {
        super(source);
    }
}

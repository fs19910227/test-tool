package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.source.DataSource;
import com.fs.test.generate.data.strategy.Strategy;

/**
 * json数据创建器
 *
 * @author zhaofushan
 * @date 2020/8/31 0031 0:21
 */
public class JsonDataCreator<T> implements DataCreator<T> {

    private DataSource<T> dataSource;

    @Override
    public T fetchData(Strategy strategy) {
        return null;
    }

    @Override
    public void setDataSource(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }
}

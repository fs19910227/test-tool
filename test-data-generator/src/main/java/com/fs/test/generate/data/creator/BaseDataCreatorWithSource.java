package com.fs.test.generate.data.creator;

import com.fs.test.generate.data.source.DataSource;
import com.fs.test.generate.data.source.InfiniteDataSource;
import com.fs.test.generate.data.source.LimitedDataSource;
import com.fs.test.generate.data.strategy.Strategy;

import java.util.Iterator;

/**
 * 抽象Data creator
 * <p>
 * 有源
 *
 * @author zhaofushan
 * @date 2020/9/1 0001 22:34
 */
public abstract class BaseDataCreatorWithSource<T> implements DataCreator<T> {
    private DataSourceWrapper<T> source;

    @Override
    public T fetchData(Strategy strategy) {
        return source.getOne(strategy);
    }

    public BaseDataCreatorWithSource(DataSource<T> source) {
        this.source = wrapper(source);
    }


    private DataSourceWrapper<T> wrapper(DataSource<T> dataSource) {
        if (dataSource instanceof InfiniteDataSource) {
            return new InfiniteWrapper<T>((InfiniteDataSource<T>) dataSource);
        } else {
            return new LimitedWrapper<T>((LimitedDataSource<T>) dataSource);
        }

    }

    abstract static class DataSourceWrapper<M> {

        abstract public M getOne(Strategy strategy);

    }

    static class InfiniteWrapper<M> extends DataSourceWrapper<M> {
        private final InfiniteDataSource<M> dataSource;

        public InfiniteWrapper(InfiniteDataSource<M> dataSource) {
            this.dataSource = dataSource;
        }


        @Override
        public M getOne(Strategy strategy) {
            return dataSource.next();
        }
    }

    static class LimitedWrapper<M> extends DataSourceWrapper<M> {
        private final LimitedDataSource<M> dataSource;
        private Iterator<M> iterator;

        public LimitedWrapper(LimitedDataSource<M> dataSource) {
            this.dataSource = dataSource;
            this.iterator = dataSource.iterator();
        }

        @Override
        public M getOne(Strategy strategy) {
            if (!iterator.hasNext()) {
                iterator = dataSource.iterator();
            }
            return iterator.next();
        }
    }
}

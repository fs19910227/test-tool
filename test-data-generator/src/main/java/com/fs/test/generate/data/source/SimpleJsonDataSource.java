package com.fs.test.generate.data.source;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 简单json数据生成器
 *
 * @author zhaofushan
 * @date 2020/9/1 0001 22:57
 */
public class SimpleJsonDataSource<T> implements LimitedDataSource<T> {

    private List<T> jsonStringList = new ArrayList<>();

    public SimpleJsonDataSource(Class<T> dataType) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        jsonStringList.add(objectMapper.readValue("{\"birthday\":1598974961919,\"name\":\"Lily\",\"age\":21}", dataType));
        jsonStringList.add(objectMapper.readValue("{\"birthday\":1593974961919,\"name\":\"Bob\",\"age\":13}", dataType));
    }

    @Override
    public long size() {
        return jsonStringList.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < jsonStringList.size();
            }

            @Override
            public T next() {
                return jsonStringList.get(index++);
            }
        };
    }

}

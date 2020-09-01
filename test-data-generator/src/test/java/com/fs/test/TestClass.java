package com.fs.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fs.test.generate.data.creator.JsonDataCreator;
import com.fs.test.generate.data.source.SimpleJsonDataSource;
import org.junit.jupiter.api.Test;

/**
 * @author zhaofushan
 * @date 2020/8/28 0028 22:21
 */
public class TestClass {
    @Test
    void name() throws JsonProcessingException {
        SimpleJsonDataSource<TestModel> source = new SimpleJsonDataSource<>(TestModel.class);
        JsonDataCreator<TestModel> testModelJsonDataCreator = new JsonDataCreator<>(source);
        for (int i = 0; i < 3; i++) {
            TestModel testModel = testModelJsonDataCreator.fetchData(null);
            System.out.println(testModel);
        }
    }
}

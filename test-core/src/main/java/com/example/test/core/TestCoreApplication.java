package com.example.test.core;

import com.example.test.core.source.RandomDataSource;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestCoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestCoreApplication.class, args);
        RandomDataSource dataSource = context.getBean(RandomDataSource.class);
        Faker faker = dataSource.getFaker();
        System.out.println(faker.name().fullName());
    }

}

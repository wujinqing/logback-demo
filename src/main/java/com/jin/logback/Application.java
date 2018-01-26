package com.jin.logback;

import com.jin.logback.entity.Student;
import com.jin.logback.service.StudentService;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@ComponentScan
public class Application {
//    @Autowired
//    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Student student = new Student("zhangsan", 10);

        System.out.println("启动完成。");

    }
}

package com.jin.logback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author wu.jinqing
 * @date 2018年01月26日
 */
@Component
public class HelloMongoDBDao {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public HelloMongoDBDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void save
}

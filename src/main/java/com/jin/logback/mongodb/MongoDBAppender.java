package com.jin.logback.mongodb;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.alibaba.fastjson.JSON;

/**
 * @author wu.jinqing
 * @date 2018年01月26日
 */
public class MongoDBAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    @Override
    protected void append(ILoggingEvent eventObject) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("======================" + eventObject.getClass());
        System.out.println(eventObject.getFormattedMessage());
        System.out.println("======================");
        String jsonStr = JSON.toJSONString(eventObject);
        System.out.println(jsonStr);
    }
}

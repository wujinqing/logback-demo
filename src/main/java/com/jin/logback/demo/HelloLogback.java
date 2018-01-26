package com.jin.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu.jinqing
 * @date 2018年01月26日
 */
public class HelloLogback {
    public static final Logger logger = LoggerFactory.getLogger("HelloLogback");

    public static void main(String[] args) {
//        logger.trace("this is trace info.");
//        logger.debug("this is debug info.");
//        logger.info("this is info level info.");

//        myMethod();
//        try {
//            throw new Exception("myexception");
//        }catch (Exception ex) {
//            logger.info("ex:", ex);
//            logger.info("name: {}, ex: {}", "zhangsan", ex);
//        }
//
//        System.out.println("end");

        HelloLogback2 h = new HelloLogback2();

        h.dosomething();
    }

    public static void myMethod()
    {
        logger.info("myMethod invoked!");
    }
}

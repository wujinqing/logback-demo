package com.jin.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu.jinqing
 * @date 2018年01月26日
 */
public class HelloLogback2 {
    public static final Logger logger = LoggerFactory.getLogger("HelloLogback2");

    public void dosomething()
    {
        logger.info("dosomething invoked!");
    }
}

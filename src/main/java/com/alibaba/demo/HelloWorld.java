package com.alibaba.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

    private static final Logger logger1 = LogManager.getLogger("log1");
    private static final Logger logger2 = LogManager.getLogger("log2");

    /**
     * Run with -Dlog4j.configurationFile=log4j2.xml,log4j2-abc.xml
     * @param args
     */
    public static void main(String[] args) {

        logger1.debug("Hello from Log4j 2");

        // in old days, we need to check the log level to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/

        // with Java 8, we can do this, no need to check the log level
        logger2.debug("{}", () -> getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
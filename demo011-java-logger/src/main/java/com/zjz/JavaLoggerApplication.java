package com.zjz;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Random;

public class JavaLoggerApplication {
    public static void main(String[] args) throws InterruptedException {
        PropertyConfigurator.configure("log4j.properties");// 配置文件
        Logger log = null;
        Logger[] logs = {Logger.getLogger("console"), Logger.getLogger("R1")};
        Random rand = new Random(System.currentTimeMillis());

        while (true) {
            log = logs[rand.nextInt(2)];
            log.debug("debug!!!");
            log.info("system info!!!");
            log.warn("warn!!!");
            log.error("error");
            TimeUnit.SECONDS.sleep(2);
        }
    }
}

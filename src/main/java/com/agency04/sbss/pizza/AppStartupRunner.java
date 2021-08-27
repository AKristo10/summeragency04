package com.agency04.sbss.pizza;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.logging.Logger;

public class AppStartupRunner implements ApplicationRunner {
    private static final Logger LOG =
            (Logger) LoggerFactory.getLogger(AppStartupRunner.class);

    public static int counter;

    @Override
    public void run(ApplicationArguments args) throws Exception {
       System.out.println("Hello from Application runner!");
        LOG.info("Increment counter");
        counter++;
    }
}

package com.agency04.sbss.pizza;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class CommandLineAppStartupRunner implements CommandLineRunner {
    private static final Logger LOG =
            (Logger) LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

    public static int counter;

    @Override
    public void run(String...args) throws Exception {
        System.out.println("Hello from CommmandLineRunner");
        LOG.info("Increment counter");
        counter++;
    }
}

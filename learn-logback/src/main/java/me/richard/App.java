package me.richard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Li on 2017/1/5.
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    private Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("app running.");
        LOGGER.warn("app stopping.");
    }
}

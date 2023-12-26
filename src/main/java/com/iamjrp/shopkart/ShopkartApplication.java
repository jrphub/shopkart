package com.iamjrp.shopkart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * For console application,
 * implements CommandLineRunner
 * Also, set spring.main.web-application-type=NONE
 */
@SpringBootApplication
@Slf4j
public class ShopkartApplication {

    public static void main(String[] args) {
        log.info("STARTING THE APPLICATION");
        SpringApplication application = new SpringApplication(ShopkartApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    /* For console application
    @Override
    public void run(String... args) throws Exception {
        log.info("EXECUTING: command line runner");
        Arrays.stream(args).forEach(System.out::println);
    }
    */

}

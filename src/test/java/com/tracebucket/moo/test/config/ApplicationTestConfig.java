package com.tracebucket.moo.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author FFL
 */
@Configuration
@ImportResource("classpath:mongo-test.xml")
@ComponentScan(basePackages = "com.tracebucket.moo.test.config")
public class ApplicationTestConfig {
}

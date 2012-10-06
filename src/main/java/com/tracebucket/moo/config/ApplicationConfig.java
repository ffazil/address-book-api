package com.tracebucket.moo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author FFL
 */
@Configuration
@ImportResource("classpath:mongo.xml")
@ComponentScan(basePackages = "com.tracebucket.moo.config")
public class ApplicationConfig {

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[]{new ClassPathResource("mongo.properties")};
        configurer.setLocations(resources);
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }*/
}
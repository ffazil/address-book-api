package com.tracebucket.moo.config;

import org.springframework.context.annotation.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

/**
 * @author FFL
 */
@Configuration
@ComponentScan(basePackages = "com.tracebucket.moo.config")
//@ImportResource("classpath:security.xml")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {


    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJacksonHttpMessageConverter jacksonHttpMessageConverter = new MappingJacksonHttpMessageConverter();
        converters.add(jacksonHttpMessageConverter);
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
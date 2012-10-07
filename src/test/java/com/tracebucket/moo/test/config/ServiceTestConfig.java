package com.tracebucket.moo.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author FFL
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.tracebucket.moo.service", scopedProxy = ScopedProxyMode.INTERFACES)
public class ServiceTestConfig {
}

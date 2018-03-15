package com.configuration.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.configuration.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

}

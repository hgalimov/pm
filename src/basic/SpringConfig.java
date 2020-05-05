package ru.uennar.basic;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.uennar")
@PropertySource("classpath:equiMaster.properties")
public class SpringConfig {
}

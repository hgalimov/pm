package ru.uennar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.uennar")
@PropertySource("classpath:equiMaster.properties")
public class SpringConfig {
    @Bean
    public MechanicEqui mechanicEqui(){
        return new MechanicEqui();
    }

    @Bean
    public EquiMaster equiMaster(){
        return new EquiMaster(mechanicEqui());
    }
}

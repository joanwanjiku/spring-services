package com.springservices.ms_spring_core.config;

import com.springservices.ms_spring_core.common.Coach;
import com.springservices.ms_spring_core.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aqua")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}

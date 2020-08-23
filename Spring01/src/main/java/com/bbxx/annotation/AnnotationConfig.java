package com.bbxx.annotation;

import com.bbxx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}

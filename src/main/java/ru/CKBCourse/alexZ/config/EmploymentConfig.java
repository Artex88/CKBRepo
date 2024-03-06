package ru.CKBCourse.alexZ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.CKBCourse.alexZ.common.Employment;

@Configuration
public class EmploymentConfig {

    @Bean
    public Employment employment(){
        return new Employment(1, "Clean room", "Bill" );
    }
}

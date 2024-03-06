package ru.CKBCourse.alexZ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.CKBCourse.alexZ.common.Item;

@Configuration
public class ItemConfig {

    @Bean
    public Item item(){
        return new Item(1, "Chair", "wood" );
    }
}

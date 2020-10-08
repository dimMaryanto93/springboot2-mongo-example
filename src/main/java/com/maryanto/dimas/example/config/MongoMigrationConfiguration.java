package com.maryanto.dimas.example.config;

import com.github.cloudyrock.mongock.MongockConnectionDriver;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.SpringDataMongo3Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoMigrationConfiguration {

    @Bean
    public MongockConnectionDriver driver(MongoTemplate mongoTemplate) {
        return SpringDataMongo3Driver.withDefaultLock(mongoTemplate);
    }

}

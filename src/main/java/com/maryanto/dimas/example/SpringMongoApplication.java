package com.maryanto.dimas.example;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableMongock
@SpringBootApplication
@EnableMongoRepositories
@EnableTransactionManagement
public class SpringMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoApplication.class, args);
    }

}

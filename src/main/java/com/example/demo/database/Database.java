package com.example.demo.database;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    //logger
    private static final Logger logger= LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase (ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("iphone 11", 2022, 10202.0);
                logger.info("insert data: " + productRepository.save(productA));
            }
        };
    }
}

package com.example.contacts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactDbLoad {

    @Bean
    CommandLineRunner init(ContactRepository repository) {
        return args -> {
            repository.save(new Contact("test0", "test0"));
            repository.save(new Contact("test1", "test1"));
            repository.save(new Contact("test2", "test2"));
        };
    }
}

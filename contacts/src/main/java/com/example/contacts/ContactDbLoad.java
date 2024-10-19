package com.example.contacts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactDbLoad {

    @Bean
    CommandLineRunner init(ContactRepository repository) {
        return args -> {
            repository.save(new Contact("Dillon", "Dhayanandan"));
            repository.save(new Contact("Abinaya", "Dhayanandan"));
            repository.save(new Contact("Yasodhara", "Dhayanandan"));
        };
    }
}

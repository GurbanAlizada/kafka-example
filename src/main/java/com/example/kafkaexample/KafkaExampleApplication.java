package com.example.kafkaexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication

public class KafkaExampleApplication implements CommandLineRunner {

    private final KafkaTemplate<String , String> kafkaTemplate;

    public KafkaExampleApplication(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       for (int i =  0 ; i  < 100 ; i++){
           kafkaTemplate.send("mytopic" , "Hello World" + i);
           kafkaTemplate.send("mytopic" , "Salam" + (2*i));
       }

    }
}

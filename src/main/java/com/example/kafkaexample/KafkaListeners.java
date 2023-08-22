package com.example.kafkaexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(
            topics = "mytopic" ,
            groupId = "groupId"
    )
    public void listener(String date){
        System.out.println("Listener : " + date);
    }





}

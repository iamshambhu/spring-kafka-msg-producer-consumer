package com.vishaluplanch.kafka.consumer;

import com.vishaluplanch.kafka.model.SimpleMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${topic.name}")
    public void receive(SimpleMessage consumerMessage) {
        log.info("Received message from kafka queue: {}", consumerMessage.getBody());
    }
}
package com.vishaluplanch.kafka.config;

import com.vishaluplanch.kafka.model.SimpleMessage;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<SimpleMessage> {
}
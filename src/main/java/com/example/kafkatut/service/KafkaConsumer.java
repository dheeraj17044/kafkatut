package com.example.kafkatut.service;

import com.example.kafkatut.dto.MessageRequestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "string-topic", groupId = "string-group")
    public void consumeMessage(String message) {
        log.info("Received message: ----> {}", message);
    }

    @KafkaListener(topics = "json-topic", groupId = "json-group")
    public void consumeJsonMessage(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        MessageRequestDto dto  = objectMapper.readValue(message, MessageRequestDto.class);

        log.info("Received json object: ----> {}", dto);
    }
}


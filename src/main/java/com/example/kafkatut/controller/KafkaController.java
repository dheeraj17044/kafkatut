package com.example.kafkatut.controller;

import com.example.kafkatut.dto.MessageRequestDto;
import com.example.kafkatut.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/produce/{message}")
    public String produceMessage(@PathVariable String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }

    @PostMapping(value = "/produce/object")
    public ResponseEntity<Object> produceJsonObject(@RequestBody MessageRequestDto requestDto){
        kafkaProducer.sendObject(requestDto);
        return new ResponseEntity<>("Json Object sent", HttpStatus.OK);
    }

}

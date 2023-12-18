package com.reactiveApp.wikimedia.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WikimediaConsumer {

    // @KafkaListener(topics="firstTopic", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from myFirst topic: %s", msg));
    }

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeJsonMsg(String msg) {
        log.info(String.format("Consuming the message from myFirst topic: %s", msg));
    }

}

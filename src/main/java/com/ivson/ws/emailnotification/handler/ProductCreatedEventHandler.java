package com.ivson.ws.emailnotification.handler;

import com.ivson.ws.emailnotification.error.NonRetryableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ivson.ws.core.ProductCreatedEvent;

@Component
@KafkaListener(topics = "product-created-events-topic")
public class ProductCreatedEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        if (true) {
            throw new NonRetryableException("An error took place. No need to consume this message again");
        }
        LOGGER.info("Product created event received: {}", productCreatedEvent.getTitle());
    }

}

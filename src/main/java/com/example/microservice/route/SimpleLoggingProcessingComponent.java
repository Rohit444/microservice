package com.example.microservice.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggingProcessingComponent {

    private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);

    // Here we are returning void here that means it will do some kind of processing only and it will not affect the body of the message itself
    public void process(String message){
            logger.info("SimpleLoggingProcessingComponent {}", message);
    }
}

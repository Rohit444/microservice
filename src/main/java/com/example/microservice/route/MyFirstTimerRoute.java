package com.example.microservice.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class MyFirstTimerRoute extends RouteBuilder {

    @Autowired
    private GetCurrentTimeBean getCurrentTimeBean;

    @Autowired
    private SimpleLoggingProcessingComponent simpleLoggingProcessingComponent;

    @Override
    public void configure() throws Exception {
        // timer we are defining here endpoint
        from("timer:my-first-timer") // null Message is producing by timer endpoint
                .log("${body}")
                .transform().constant("My Constant Message")
                .log("${body}")
        //        .transform().constant("Time now is "+ LocalDateTime.now())
                .bean(getCurrentTimeBean,"getCurrentTime")
                .log("${body}")
                .bean(simpleLoggingProcessingComponent)
                .log("${body}")
                .process(new SimpleLoggingProcessor())
                .to("log:my-first-timer");
        // transformation

        // log the message
    }
}

// There are two types of operations that we can perform in our specific route
// One is Processing and another one is Transformation

// Processing: When we perform some operation which doesn't change the body of the message itself that is called Processing
// Transformation: When we perform some operation which do change the body of the message itself that is called Transformation.

  //      2021-12-11 22:43:57.544  INFO 2259 --- [/my-first-timer] route1                                   : null
  //      2021-12-11 22:43:57.545  INFO 2259 --- [/my-first-timer] route1                                   : My Constant Message
  //      2021-12-11 22:43:57.545  INFO 2259 --- [/my-first-timer] route1                                   : Time Now is 2021-12-11T22:43:57.545486
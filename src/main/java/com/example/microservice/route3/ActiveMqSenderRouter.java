package com.example.microservice.route3;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //timer
        from("timer:active-mq-timer?period=10000")
                .transform().constant("My Message For Active MQ")
                .log("${body}")
                .to("activemq:my-active-queue");

        // queue

    }
}

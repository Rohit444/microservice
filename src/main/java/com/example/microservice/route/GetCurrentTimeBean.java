package com.example.microservice.route;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetCurrentTimeBean {
    public String getCurrentTime(){
        return "Time Now is "+ LocalDateTime.now();
    }
}

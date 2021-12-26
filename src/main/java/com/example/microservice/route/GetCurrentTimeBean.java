package com.example.microservice.route;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GetCurrentTimeBean {
    public String getCurrentTime(){
        return "Time Now is "+ LocalDateTime.now();
        // making this comment intentionaly to have some changes in this file
    }
}

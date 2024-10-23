package com.example.homework2.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(MyEvent myEvent) {
        System.out.println("Publishing new event");
        eventPublisher.publishEvent(myEvent);
    }
}

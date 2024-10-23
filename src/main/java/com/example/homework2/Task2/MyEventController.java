package com.example.homework2.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class MyEventController {

    @Autowired
    private MyEventPublisher myEventPublisher;

    @GetMapping
    public void event() {
        myEventPublisher.publishEvent(new MyEvent(this ,"hello event"));
    }
}

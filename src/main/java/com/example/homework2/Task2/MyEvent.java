package com.example.homework2.Task2;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    @Getter
    private String message;

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}

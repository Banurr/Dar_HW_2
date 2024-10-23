package com.example.homework2.Task6;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Component
@Scope("prototype")
public class FirstBean {

    private int randomNumber;

    public FirstBean() {
        this.randomNumber = (int)(Math.random() * 100 + 1);
    }

}

package com.example.homework2.Task6;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    @Getter
    private int randomNumber;

    private final FirstBean firstBean;

    public SecondBean(FirstBean firstBean) {
        this.firstBean = firstBean;
        this.randomNumber = firstBean.getRandomNumber();
    }
}

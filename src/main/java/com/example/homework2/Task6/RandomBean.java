package com.example.homework2.Task6;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class RandomBean {

    private int randomNumber;

    public RandomBean(RandomBeanLazy randomBeanLazy) {
        this.randomNumber = randomBeanLazy.randomNumber();
    }
}
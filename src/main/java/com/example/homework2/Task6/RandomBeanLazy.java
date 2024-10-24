package com.example.homework2.Task6;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Lazy
public class RandomBeanLazy {

    public int randomNumber() {
        return (int)(Math.random() * 100 + 1);
    }
}

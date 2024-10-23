package com.example.homework2.Task3;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Component
public class SpelValues {

    @Value("#{55+34}")
    private int age;

    @Value("#{systemProperties['user.home']}")
    private String name;

    @Value("#{T(java.time.LocalDate).now()}")
    private LocalDate currentDate;

    @Value("#{T(java.lang.Math).random()*100+1}")
    private int randomNumber;
}

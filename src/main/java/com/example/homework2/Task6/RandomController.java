package com.example.homework2.Task6;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getRandomNumber")
@RequiredArgsConstructor
public class RandomController {

    private final SecondBean secondBean;

    @GetMapping
    private int getRandomNumber() {
        return secondBean.getRandomNumber();
    }
}

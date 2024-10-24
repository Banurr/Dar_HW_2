package com.example.homework2.Task6;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getRandomNumber")
@RequiredArgsConstructor
public class RandomController {

    private final RandomBean randomBean;

    @GetMapping
    private void getRandomNumber() {
        System.out.println(randomBean.getRandomNumber());
    }

    // Каждый раз при запросе возвращается одно и то же число.
    // Объясняется тем, что бин RandomBean инициализируется только один раз,
    // когда его запрашивают впервые
    // Component, по дефолту синглтон и поэтому на все запросы возвращается один и тот же бин,
    // соответственно одно и то же значение
}

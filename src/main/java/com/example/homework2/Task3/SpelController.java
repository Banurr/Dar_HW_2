package com.example.homework2.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spel")
public class SpelController {

    @Autowired
    private SpelValues spelValues;

    @GetMapping
    public List<String> getValues() {
        List<String> result = new ArrayList<>();

        result.add("Sum  55 + 34 = " + spelValues.sum(0));
        result.add("User Name = " + spelValues.userName(null));
        result.add("User Home = " + spelValues.userHome(null));
        result.add("Current Date = " + spelValues.currentDate(null));
        result.add("Random Number = " + spelValues.randomNumber(0));
        result.add("Time Zone = " + spelValues.timeZone(null));
        result.add("Comparison (128 > 32) = " + spelValues.compare(false));
        result.add("Power (3^5) = " + spelValues.power(0));
        result.add("String bean value = " + spelValues.stringBeanValue);
        result.add("Java version = " + spelValues.javaVersion(null));

        return result;
    }
}

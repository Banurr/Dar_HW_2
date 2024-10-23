package com.example.homework2.Task3;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/spel")
public class SpelController {

    @Autowired
    private SpelValues spelValues;

    @GetMapping
    public List<Object> getValues() throws IllegalAccessException {

        List<Object> result = new ArrayList<>();
        Field[] fields = spelValues.getClass().getDeclaredFields();
        for (var field : fields) {
            field.setAccessible(true);
            result.add(field.getName() + " = " + field.get(spelValues));
        }
        return result;
    }
}

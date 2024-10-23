package com.example.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class HomeWork2Application {


    public static void main(String[] args) {
        SpringApplication.run(HomeWork2Application.class, args);
    }

}

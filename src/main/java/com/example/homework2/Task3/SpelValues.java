package com.example.homework2.Task3;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class SpelValues {

    @Bean
    public int sum(@Value("#{55 + 34}") int sum) {
        return sum;
    }

    @Bean
    public String userName(@Value("#{systemProperties['user.name']}") String userName) {
        return userName;
    }

    @Bean
    public String userHome(@Value("#{systemProperties['user.home']}") String userHome) {
        return userHome;
    }

    @Bean
    public LocalDate currentDate(@Value("#{T(java.time.LocalDate).now()}") LocalDate currentDate) {
        return currentDate;
    }

    @Bean
    public int randomNumber(@Value("#{T(java.lang.Math).random()*100+1}") int randomNumber) {
        return randomNumber;
    }

    @Bean
    public String timeZone(@Value("#{systemProperties['user.timezone']}") String timeZone) {
        return timeZone;
    }

    @Bean
    public String stringBean() {
        return "Hi, i am string bean";
    }

    @Value("#{stringBean}")
    public String stringBeanValue;

    @Bean
    public String javaVersion(@Value("#{systemProperties['java.version']}") String javaVersion) {
        return javaVersion;
    }

    @Bean
    public boolean compare(@Value("#{ 128 > 32 }") boolean compare) {
        return compare;
    }

    @Bean
    public int power(@Value("#{ 3^5 }") int power) {
        return power;
    }
}

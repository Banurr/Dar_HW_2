package com.example.homework2.Task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConguration {

    @Bean
    public Employee employeeWithConfig() {
        return new Employee("John", 30, "Engineering");
    }
}

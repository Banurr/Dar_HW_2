package com.example.homework2.Task1;

import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employeeWithComponent")
@Scope("prototype")
@ToString
public class Employeee {
    private String name;
    private int age;
    private String department;

    public Employeee() {
        this.name = "Azamat";
        this.age = 12;
        this.department = "HR";

    }
}

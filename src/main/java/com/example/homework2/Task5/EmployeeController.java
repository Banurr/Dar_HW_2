package com.example.homework2.Task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeServiceCDI;

    @Autowired
    private EmployeeService employeeServiceSDI;

    public EmployeeController(EmployeeService employeeServiceCDI) {
        this.employeeServiceCDI = employeeServiceCDI;
    }

    @GetMapping("/cdi")
    public String greetCdi() {
        return employeeServiceCDI.display() + "CDI";
    }

    @GetMapping("/sdi")
    public String greetSdi() {
        return employeeServiceSDI.display() + "SDI";
    }
}

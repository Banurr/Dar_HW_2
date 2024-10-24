package com.example.homework2.Task4;

import com.example.homework2.Task1.Employee;
import com.example.homework2.Task1.Employeee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task4")
public class BeanController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping
    public String getEmployee() {
        Employee employeeConfig = (Employee) applicationContext.getBean("employeeWithConfig");
        Employeee employeeComponent = (Employeee) applicationContext.getBean("employeeWithComponent");
        Employeee employeeComponent2 = (Employeee) applicationContext.getBean("employeeWithComponent");
        Employee employeeXml = (Employee) applicationContext.getBean("employeeWithXml");
        System.out.println(employeeConfig);
        System.out.println(employeeComponent);
        System.out.println(employeeXml);

        // Хэш коды отличаются, значит создаются новые объекты, scope prototype
        System.out.println(employeeComponent.hashCode());
        System.out.println(employeeComponent2.hashCode());

        return "See the console";
    }
}

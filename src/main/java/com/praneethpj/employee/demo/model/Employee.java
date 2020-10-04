package com.praneethpj.employee.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // allows to import this class
@ComponentScan // Scan for beans and other configuration classes
@Getter
@Setter
public class Employee {
    private int employeeId;
    private String employeeName;
}

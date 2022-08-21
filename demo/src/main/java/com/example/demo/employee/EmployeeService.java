package com.example.demo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        return List.of(
                new Employee(
                        1L,
                        "Jack",
                        "Nicalson",
                        "jack.nicalson@techgroup.com",
                        LocalDate.of(1990, Month.DECEMBER,12),
                        32,
                        6
                )
        );
    }
}

package com.example;

import java.util.List;

import com.example.EM_Project.Employee;

public interface EmployeeService {

    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    
    
}


    


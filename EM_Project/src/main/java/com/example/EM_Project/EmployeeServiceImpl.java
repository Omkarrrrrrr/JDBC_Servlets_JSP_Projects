package com.example.EM_Project;

import java.util.ArrayList;
import java.util.List;

import com.example.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
       employees.add(employee);
       return "Saved succesfully";
    }

    @Override
    public List<Employee> readEmployees() {
      return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) { 
        employees.remove(id);
        return true;
    }

}

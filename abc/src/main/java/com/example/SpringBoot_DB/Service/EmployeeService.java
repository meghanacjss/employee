package com.example.SpringBoot_DB.Service;

import com.example.SpringBoot_DB.Model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

 //   Employee getEmployeeById(int employeeId);

    void updateEmployee(Employee updatedEmployee);

    void deleteEmployeeById(int employeeId);
}

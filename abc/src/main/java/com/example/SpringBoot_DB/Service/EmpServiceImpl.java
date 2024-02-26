package com.example.SpringBoot_DB.Service;

import com.example.SpringBoot_DB.Model.Employee;

import com.example.SpringBoot_DB.Repository.EmpRepo;
import com.example.SpringBoot_DB.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmployeeService{
@Autowired
    private EmpRepo empRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.getEmployeeList();
    }

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("113");
        System.out.println(employee.getEmployeeId());
        empRepo.addEmployee(employee);
    }

//    @Override
//    public Employee getEmployeeById(int employeeId) {
//        return empRepo.getEmployeeById(employeeId);
//    }

    @Override
    public void updateEmployee(Employee updatedEmployee) {
        empRepo.updateEmployee(updatedEmployee);
    }

    @Override
    public void deleteEmployeeById(int employeeId) {
        empRepo.deleteEmployeeById(employeeId);
    }
}

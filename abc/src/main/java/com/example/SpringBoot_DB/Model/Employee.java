package com.example.SpringBoot_DB.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;


@Entity
@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name="Employee_details")
//@Component
public class Employee {
@Id
    private int employeeId;
    private String employeeName;
    private String employeeRole;
    private long employeeSalary;

    public Employee(){

    }

    public Employee(int employeeId, String employeeName, String employeeRole, long employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

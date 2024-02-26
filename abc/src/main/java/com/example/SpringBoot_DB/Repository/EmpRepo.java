package com.example.SpringBoot_DB.Repository;

import com.example.SpringBoot_DB.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepo  {

    @Autowired
        private  Repo repo;

        public List<Employee> getEmployeeList() {
            return repo.findAll();
        }

        public void addEmployee(Employee employee) {
            repo.save(employee);
            System.out.println("Employee added to the database");
        }

        public Employee getEmployeeById(int employeeId) {
            return repo.findById(employeeId).orElse(null);
        }

        public void updateEmployee(Employee updatedEmployee) {
            if (repo.existsById(updatedEmployee.getEmployeeId())) {
                repo.save(updatedEmployee);
                System.out.println("Employee updated successfully");
            } else {
                System.out.println("Employee with ID " + updatedEmployee.getEmployeeId() + " not found");
            }
        }

        public void deleteEmployeeById(int employeeId) {
            if (repo.existsById(employeeId)) {
                repo.deleteById(employeeId);
                System.out.println("Employee with ID " + employeeId + " deleted successfully");
            } else {
                System.out.println("Employee with ID " + employeeId + " not found");
            }
        }
    }







































//    ArrayList<Employee> employeeList=new ArrayList<>();
//    HashMap<Integer,String> employeeMap=new HashMap<>();
//
//    public EmpRepo() {
//        Employee emp1=new Employee("john",91,"HR",30000);
//        employeeList.add(emp1);
//        Employee emp2=new Employee("sam",92,"Manager",100000);
//        employeeList.add(emp2);
//        Employee emp3=new Employee("mona",93,"TL",90000);
//
//        employeeList.add(emp3);
//    }
//
//    public ArrayList<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(ArrayList<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
//
//    public void addEmployee(Employee emp) {
//        employeeList.add(emp);
//        System.out.println("Employee added to list");
//    }
//    public HashMap<Integer, String> getEmployeeMap() {
//        return employeeMap;
//    }
//
//    public void setEmployeeMap(HashMap<Integer, String> employeeMap) {
//        this.employeeMap = employeeMap;
//    }
//
//    public Employee getEmployeeById(int employeeId) {
//        for (Employee emp : employeeList) {
//            if (emp.getEmployeeId() == employeeId) {
//                return emp;
//            }
//        }
//        return null;
//    }
//
//    public void updateEmployee(Employee updatedEmp) {
//        Employee existingEmp = getEmployeeById(updatedEmp.getEmployeeId());
//        if (existingEmp != null) {
//            existingEmp.setEmployeeName(updatedEmp.getEmployeeName());
//            existingEmp.setEmployeeRole(updatedEmp.getEmployeeRole());
//            existingEmp.setEmployeeSalary(updatedEmp.getEmployeeSalary());
//            System.out.println("Employee updated successfully");
//        } else {
//            System.out.println("Employee with ID " + updatedEmp.getEmployeeId() + " not found");
//        }
//    }
//
//    public void deleteEmployeeById(int employeeId) {
//        Employee empToRemove = getEmployeeById(employeeId);
//        if (empToRemove != null) {
//            employeeList.remove(empToRemove);
//            System.out.println("Employee with ID " + employeeId + " deleted successfully");
//        } else {
//            System.out.println("Employee with ID " + employeeId + " not found");
//        }
//    }


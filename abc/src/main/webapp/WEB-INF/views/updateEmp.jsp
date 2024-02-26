<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2><i>Update Employee</i></h2>

    <form action="updateEmployee" method="post">
        Enter Employee ID to update: <input type="number" name="employeeId" required><br>
        Enter New Employee Name: <input type="text" name="employeeName" required><br>
        Enter New Employee Role: <input type="text" name="employeeRole" required><br>
        Enter New Employee Salary: <input type="number" name="employeeSalary" required><br>
        <input type="submit" value="Update">
    </form>
    <br>
    <a href="getAllEmployees">View Employees</a>
    <a href="index" >back</a>
</body>
</html>

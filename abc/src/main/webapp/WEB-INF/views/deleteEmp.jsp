<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>
    <h2><i>Delete Employee</i></h2>

    <form action="/">
        Enter Employee ID to delete: <input type="number" name="employeeId" required>
        <input type="submit" value="Delete">
    </form>
    <a href="getAllEmployees">View Employees</a>
    <a href="index" >back</a>

</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

</head>
<body>
<!DOCTYPE html>

<form:form modelAttribute="employee" action="addEmp">
    <table>
        <tr>
            <td> Employee Id</td>
            <td><form:input path="employeeId" type="number"/></td>
        </tr>
        <tr>
            <td> Employee Name</td>
            <td><form:input path="employeeName" type="text"/></td>
        </tr>
        <tr>
            <td> Employee Role</td>
            <td><form:input path="employeeRole" type="text"/></td>
        </tr>
        <tr>
            <td> Employee Salary</td>
            <td><form:input path="employeeSalary" type="number"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Employee"></td>
        </tr>
    </table>

</form:form>
<a href="index">back</a>
</body>
</html>
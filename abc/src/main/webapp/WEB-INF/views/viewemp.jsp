<%@ page import="java.util.List" %>
<%@ page import="com.example.SpringBoot_DB.Model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
 <center>
    <h1><i>Employee List</i></h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>Role</th>
            <th>Salary</th>
            <th>Update</th>
            <th>delete</th>
        </tr>
        </center>
        <%
            List<Employee> getEmployeeList = (List<Employee>) request.getAttribute("EmployeeList");
            for (Employee employee : getEmployeeList) {
        %>
            <tr>
                <td><%= employee.getEmployeeId() %></td>
                <td><%= employee.getEmployeeName()  %></td>
                <td><%= employee.getEmployeeRole() %></td>
                <td><%= employee.getEmployeeSalary() %></td>
                 <td><a href="updateEmployee?id=<%= employee.getEmployeeId() %>">Update</a></td>
                  <td><a href="deleteEmployee?id=<%= employee.getEmployeeId() %>">Delete</a> </td>

            </tr>
        <% } %>
    </table>
    <a href="index">back</a>
</body>
</html>


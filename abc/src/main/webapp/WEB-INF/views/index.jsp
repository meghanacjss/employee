<%@page language="java" %>
<html>
<head>
    <style>
        body {
            background-color: pink;
        }
        button {
            background-color: black;
            color:white;
            padding: 10px 20px;
            margin: 5px;
            cursor: pointer;
        }
    </style>
</head>

<center>
<body >
    <button onclick="redirectTo('add')">Add New Employee</button>

    <button onclick="redirectTo('getAllEmployees')">Get All Employees</button>

    <button onclick="redirectTo('updateEmployee')">Update Employee</button>

    <button onclick="redirectTo('deleteEmployee')">Delete Employee</button>

  <script>
        function redirectTo(url) {
            window.location.href = url;
        }
    </script>
</body>
</center>

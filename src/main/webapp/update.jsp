<%@page import="com.model.Employee"%>
<%@page import="com.dao.EmployeeDao"%>
<%@ page import="java.util.*, com.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>

<h1>Update employee details</h1>

<%
  int id=Integer.parseInt(request.getParameter("id"));
  EmployeeDao dao = new EmployeeDao();
 Employee emp = dao.getEmployee(id);
%>

<form action="update" method="post">
 Employee Id: <input type="hidden" name="id" value="<%= emp.getEmpId() %>"><br><br>
  Name: <input type="text" name="name" value="<%= emp.getName() %>" ><br><br>
  Age: <input type="number" name="age" value="<%= emp.getAge() %>"><br><br>
  Email: <input type="email" name="email" value="<%= emp.getEmail() %>"><br><br>
  Phone number: <input type="number" name="phoneNumber" value="<%= emp.getPhoneNo()%>"><br><br>
  Salary: <input type="number" name="salary" value="<%= emp.getSalary()%>"><br><br>
  <input type="submit" value="Update">
</form>

</body>
</html>

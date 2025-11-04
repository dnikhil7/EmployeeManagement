<%@ page import="java.util.*, com.model.Employee" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employees</title>
</head>
<body>
<marquee>Welcome <%=session.getAttribute("email") %></marquee><hr>

<a href="addEmployee.jsp">Add a new Employee</a><hr>

<table border="1">
<tr>   

<th>Employee ID</th>
<th>Name</th>
<th>Age</th>
<th>Email</th>
<th>Phone number</th>
<th>Salary</th>
<th>Update</th>
<th>Delete</th>

</tr>

<tr> 

<% List<Employee> empList=(List<Employee>)request.getAttribute("emplist");
for(Employee emp :empList){

%>

<tr> 

<td> <%= emp.getEmpId() %> </td>
<td> <%= emp.getName() %> </td>
<td> <%= emp.getAge() %> </td>
<td> <%= emp.getEmail() %> </td>
<td> <%= emp.getPhoneNo() %> </td>
<td> <%= emp.getSalary() %> </td>
<td><a href="update.jsp?id=<%= emp.getEmpId() %>">Update Emp</a></td>
<td><a href="delete?id=<%= emp.getEmpId() %>">Delete Emp</a></td>  
</tr>

<%}%>


</table><hr>

</body>
</html>
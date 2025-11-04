package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.EmployeeDao;
import com.model.Employee;


@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phone number");
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		Employee emp = new Employee(name, age, email, phoneNo, salary);
		EmployeeDao empDao= new EmployeeDao();
		empDao.addEmployee(emp);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/employees");
		requestDispatcher.forward(request, response);
	}

}

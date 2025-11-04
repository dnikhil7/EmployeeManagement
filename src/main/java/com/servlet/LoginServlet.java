package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.dao.UserDao;
import com.model.Users;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		Users user=new Users(email,password);
		
		UserDao dao= new UserDao();
		boolean isValid = dao.validateUser(user);
		if(isValid) {
			HttpSession session = request.getSession();
			String name=user.getEmail().split("@")[0];
			session.setAttribute("email", name);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employees");
			requestDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}

}
	
}

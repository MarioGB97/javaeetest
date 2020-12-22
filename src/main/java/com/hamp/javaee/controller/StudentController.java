package com.hamp.javaee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hamp.javaee.service.StudentService;


@WebServlet("/*")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final StudentService studentService = new StudentService();


	public StudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("hola");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String studentID = request.getParameter("id");
		if (studentID != null) {
			int id = Integer.parseInt(studentID);
			studentService.getStudent(id).ifPresent(s -> request.setAttribute("studentRecord", s));
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
		dispatcher.forward(request, response);
	}

}

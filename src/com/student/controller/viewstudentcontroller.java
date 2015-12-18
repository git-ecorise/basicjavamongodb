package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.student.services.ViewStudent;

@WebServlet("/viewstudentcontroller")
public class viewstudentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public viewstudentcontroller() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ViewStudent service=new ViewStudent();
		String json=service.FetchStudent();
		response.setContentType("Applicatuin/json");
		PrintWriter out=response.getWriter();
		System.out.println("JSON:"+json);
		out.println(json);
	}

}

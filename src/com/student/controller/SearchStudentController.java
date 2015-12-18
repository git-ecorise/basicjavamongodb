package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.services.SearchStudent;


@WebServlet("/SearchStudentController")
public class SearchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchStudentController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SearchStudent service=new SearchStudent();
		String rollno=request.getParameter("id");
		System.out.println(rollno);

		String json=service.searchStudent1(rollno);
		System.out.println("JSONDATA:"+json);
		response.setContentType("Applicatuin/json");
		PrintWriter out=response.getWriter();
		out.println(json);	
		}
	}



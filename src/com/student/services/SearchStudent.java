package com.student.services;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.student.dao.SearchStudentDao;
import com.student.model.Student;


public class SearchStudent {

	public String searchStudent1(String rollno) {
		SearchStudentDao dao=new SearchStudentDao();
		ArrayList<Student> student=dao.searchStudent1(rollno);
		String json=makeJsonFomBean1(student);
		return json;
	}
	private String makeJsonFomBean1(ArrayList<Student> student) {
		Gson gson=new Gson();
		return gson.toJson(student);
	}
	}

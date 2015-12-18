package com.student.services;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.student.dao.FetchStudent;
import com.student.model.Student;

public class ViewStudent {

	public String FetchStudent() {
		FetchStudent dao=new FetchStudent();
		ArrayList<Student> student=dao.fetchStudent();
		String json=makeJsonFomBean(student);
		return json;
	}
	private String makeJsonFomBean(ArrayList<Student> student) {
		Gson gson=new Gson();
		return gson.toJson(student);
	}
	}


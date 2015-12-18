package com.student.services;


import com.google.gson.Gson;
import com.student.dao.StudentDao;
import com.student.model.Student;

public class StudentServices {

	public void insertData(String studentData) {
		
			System.out.println("In Services..!");
			System.out.println(studentData);
			StudentDao dao=new StudentDao();
			Student student=makeBeanFromJson(studentData);
			dao.insertRecord(student);
		}
		private Student  makeBeanFromJson(String data)
		{
			Gson gson=new Gson();
			return gson.fromJson(data, Student.class);
		}
		
	}

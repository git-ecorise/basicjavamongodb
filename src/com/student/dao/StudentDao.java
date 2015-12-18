package com.student.dao;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.student.model.Student;

public class StudentDao {

	public void insertRecord(Student student) {
		try {
			
			System.out.println("In Dao..!");
			System.out.println("Student Name:"+student.getName());
			 MongoClient mongo1 = new MongoClient();
			 DB db = mongo1.getDB( "SampleStudent" );
	        
	         DBCollection coll = db.getCollection("docStudent");

			 BasicDBObject doc=new BasicDBObject();

	         doc.put("rollno", student.getRollno().toString());
	         doc.put("name", student.getName().toString());
	         doc.put("branch", student.getBranch().toString());
	         doc.put("add", student.getAdd().toString());

	         coll.insert(doc);

	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (MongoException e) {
		e.printStackTrace();
	}
	}

}

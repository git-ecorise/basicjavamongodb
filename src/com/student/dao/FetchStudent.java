package com.student.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.student.model.Student;

public class FetchStudent {

	public ArrayList<Student> fetchStudent() {
		ArrayList<Student> list=new ArrayList<Student>();
		try {
			 MongoClient mongo1 = new MongoClient();
			 DB db = mongo1.getDB( "SampleStudent" );
			    
	        DBCollection coll = db.getCollection("docStudent");
	        List <DBObject> myList = coll.find().toArray();
	        for(int i=0;i<myList.size();i++)
	        {
	        	Student student=new Student();
	        	
	            student.setRollno(myList.get(i).get("rollno").toString());
	            student.setName(myList.get(i).get("name").toString());
	   	        student.setBranch(myList.get(i).get("branch").toString());
		        student.setAdd(myList.get(i).get("add").toString());
		        list.add(student);
	        }
	        
	} 
		catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}

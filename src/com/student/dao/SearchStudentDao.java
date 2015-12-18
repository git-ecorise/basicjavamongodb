package com.student.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.student.model.Student;

public class SearchStudentDao {

	public ArrayList<Student> searchStudent1(String rollno) {

ArrayList<Student> list=new ArrayList<Student>();
		
		try{   
			 MongoClient mongo1 = new MongoClient();
			 DB db = mongo1.getDB( "SampleStudent" );                 
			
	         DBCollection coll = db.getCollection("docStudent");
			 BasicDBObject andQuery = new BasicDBObject();
			    
				 andQuery=new BasicDBObject("rollno", rollno);
				
			    List<DBObject> myList =  coll.find(andQuery).toArray(); 
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
		catch(Exception e){
			e.printStackTrace();
		     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		  }
		return list;
	}
}

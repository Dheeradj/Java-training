package com.app.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.app.model.Student;





public class DBHelper {

	Connection con;
	Statement stmt;
	
	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded");
			
		} catch (Exception e) {
			System.out.println("Some exception "+e);
		}
	}
	
	
	public void createConnectionn() {
		try {
		String user = "root";
		String password = "";
		//String url = "jdbc:mysql://localhost/auridb?serverTimezone=UTC"; // For server timezone errors :)
		String url = "jdbc:mysql://localhost/student";
		
		con = DriverManager.getConnection(url, user, password);
		System.out.println(">> 2. Connection Created");
		}catch (Exception e) {
			System.out.println("Some exception "+e);
		}
	}
	
	
	
	public void saveStudentInDB(Student cRef){
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "insert into student values(null, '"+cRef.name+"', '"+cRef.email+"', '"+cRef.course+"')";
			// 3.2 Execute SQL Statement
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println(">> 3. "+cRef.name+" Saved in DB "+i);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception:"+e);
		}
	}
	
	
	
	
	

}

package com.app.main;

import java.util.Scanner; 


import com.app.controller.DBHelper;
import com.app.model.Student;

import com.app.view.AddStudentGUI;
public class App {

	public static void main(String[] args) {
		
//		Student student = new Student();
//		Scanner scanner = new Scanner(System.in);
//		
////		System.out.println("Enter your rollno: ");
////		student.rollno = scanner.nextLine();
//		
//		System.out.println("Enter your name: ");
//		student.name = scanner.nextLine();
//		
//		System.out.println("Enter your email: ");
//		student.email = scanner.nextLine();
//		
//		System.out.println("Enter your course: ");
//		student.course = scanner.nextLine();
//		
//		
//		System.out.println(student);
//
//		
//		DBHelper db = new DBHelper();
//		db.createConnectionn();
//		db.saveStudentInDB(student);
//		db.closeConnection();
		
		AddStudentGUI gui = new AddStudentGUI();
		gui.showGUI();
	}

}

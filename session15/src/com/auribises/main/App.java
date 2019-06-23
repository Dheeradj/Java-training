package com.auribises.main;
import java.util.Scanner;

import com.auribises.model.Customer;
import java.io.File;
import java.io.FileWriter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cRef1= new Customer();
		
		
		
		Scanner sRef = new Scanner(System.in);
		
		System.out.println("Enter the customer name: ");
		cRef1.name=sRef.nextLine();
		
		System.out.println("Enter the customer phone: ");
		cRef1.phone=sRef.nextLine();
		System.out.println("Enter the customer email: ");
		cRef1.email=sRef.nextLine();
		
//		cRef1.phone="289464289";
//		cRef1.email="DJ@gmail.com";
		System.out.println("customer details: ");
		System.out.println(cRef1.toCSV());
		
		
		System.out.println("Would you like to save the data: ");
		String choice = sRef.nextLine();
		if(choice.equals("yes")) {
			
		
		try {
			File file = new File("C:\\Users\\dheer\\Desktop\\customers.csv");
			FileWriter writer = new FileWriter(file, true);
			
			String data = cRef1.toCSV();
			writer.write(data);
			
			writer.close();
			
			System.out.println("File written with data :)");
		} catch (Exception e) {
			System.out.println("Some error" +e);
		}
		
	}
	}
}

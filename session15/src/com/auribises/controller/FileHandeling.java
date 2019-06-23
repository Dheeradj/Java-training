package com.auribises.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandeling {
	
	//1. Input and output stream: Data is written in the form of bytes
	//		This can also process characters
	
	//2.  Reader and write stream: Data is written in the form of characters
	// 		This can only and ony process characters
	
	
	
	public void writeInFile(String data) {
		
		
		try {
			File  file = new File("C:\\Users\\dheer\\Desktop\\MyApp.java");
			FileWriter writer = new FileWriter(file);
			writer.write(data);
			writer.close();
			System.out.println("Data written succesfully");
		} catch (Exception e) {
			System.out.println("Sorry some error occured!! ");
		}
	}
		
	
	
	
	
	
		public void writeInFileAgain(String data) {
			
			
			try {
				File  file = new File("C:\\Users\\dheer\\Desktop\\YourApp.java");
				FileOutputStream stream = new FileOutputStream(file);
				stream.write(data.getBytes());
				stream.close();
				System.out.println("Data written succesfully");
			} catch (Exception e) {
				System.out.println("Sorry some error occured!! ");
			}
	}
		
		
		
		
		
		public void readFromFile() {
			try{
				File  file = new File("C:\\Users\\dheer\\Desktop\\MyApp.java");
			
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			buffer.close();
			reader.close();
		}catch (Exception e) {
			System.out.println("Exception is "+e);
		}
			
	
		}
		
		
		public void readFromFileAgain() {
			try{
				File  file = new File("C:\\Users\\dheer\\Desktop\\MyApp.java");
			
			FileInputStream stream = new FileInputStream(file);
			
			int i = 0;
			
			while((i = stream.read())!=-1) {
				System.out.println((char)i);
			}
		}catch (Exception e) {
			System.out.println("Exception is "+e);
		}
			
	
		}

}

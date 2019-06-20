package com.auribises.exeptions;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("App started");
		
		boolean debug = true;
		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		
				
				
		try {
			System.out.println("arr[10] is: "+arr[1]);
			c=a/b;
		}catch(ArrayIndexOutOfBoundsException aref) {
			System.out.println("Some error occured: "+aref);
		}catch(ArithmeticException ae) {
			System.out.println("Some error occured: "+ae.getMessage());
		
			
			if (debug) {
				ae.printStackTrace();
			
			}else {
				System.out.println("Some arithmetic error: "+ae.getMessage());
			}
		}
		
		
		catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}finally {
			System.out.println("Thank you!!");
		}
		
		
		System.out.println("Hello John thank you for using our app");

		System.out.println("App stopped");
		
	}

}

//Exception is a error i=on runtime
// Whenever exeption will come program will terminate abnormally
// Program. App will crash
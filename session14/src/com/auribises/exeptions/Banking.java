package com.auribises.exeptions;
/*
	java.lang or may be some other package in java
	
	Throwable
		- Error 		-> Memory eg. StackOverflow -> Cannot be Handled
		- Exception 	-> Can be Handled
			
			- RuntimeException
				-ArrayIndexOutOfBoundsException
				-ArithmeticException
				-NullPOinterException
				.
				...
			- IOException
				- FileNotFoundException
				.
				..
			- SQLException
			.
			..
			....
			
			PS: RuntimeException and all its children are known as UNCHECKED EXCEPTIONS
				Other than everyone is a CHECKED EXCEPTION
	
*/

//USer-Defined Exception - UNCHECKED Exception
class MyBankingException extends RuntimeException{//IS-A
	MyBankingException(String message){
		super(message);
	}
}


//User-Defined Exception - CHECKED Exception :)
class YourBankingException extends Exception{ // IS-A
	YourBankingException(String message){
		super(message); // To show the message on Console
	}
}



class BankAccount{
	int balance = 10000;
	int minAttempts = 0;
	
	void withdraw(int amount)throws YourBankingException{
		balance = balance - amount;
		
		if(balance<0) {
			balance = balance + amount;
			System.out.println("Sorry You can not withdraw. Balance is low"+balance);
			minAttempts++;
		}else {
			System.out.println("New balance after withdrawl is: "+balance);
		}
		if (minAttempts == 3) {
//			ArithmeticException aRef = new ArithmeticException("Illegal attempts!!");
//			throw aRef;
			
			//Unchecked
//			MyBankingException mRef = new MyBankingException("Illegal attempts!!");
//			throw mRef;
			
			// CHECKED
			YourBankingException yRef = new YourBankingException("Illegal Attempts");
			throw yRef;
		}
	}
}




public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Banking started: ");
		
		BankAccount bRef = new BankAccount();
		
		try {
			for(int i = 0; i < 10; i++) {
				bRef.withdraw(3000);
			}
			
		}catch(Exception yRef) {//RTP
				System.out.println("Some exception: "+yRef.getMessage());
			}
		
		
		System.out.println("Banking finished");
	}

}

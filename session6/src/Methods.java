
public class Methods {
//methods or functions or procedure
	// we can create functions to solve problems 
	//syntax: acknowledgment functionname(inputs){
	//definition
	//}
	
	
	
/*	//non-static
	void addNumbers(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is: "+sum);
	}
	
	
	//static
	static void addNumbersagain(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is: "+sum);
	}
	
	*/
	int addNumbers(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is: "+sum);
		return 1;
	}
	
	
	//static
	static int addNumbersagain(int num1, int num2) {
		int sum = num1 +num2;
		System.out.println("Sum is: "+sum);
		return 1;
	}
	
	//code is executed in main
	
	
	
	public static void main(String[] args) {
	/*	
	 * 
	 * int num1 = 10;
		int num2= 20;
		int sum = num1+num2;
		System.out.println("Sum"+sum);
		
		
		 num1 = 10;
		 num2= 50;
		 sum = num1+num2;
		System.out.println("Sum"+sum);
		*/
	
	//1. execute non-static method 
	//int a1 []= new int[5];//array construction statement
	
	    Methods mRef = new Methods();//object construction statement
		int ack = mRef.addNumbers(10,20);
		//System.out.println("## Ack is:"+ack);
		if(ack==1) {
			System.out.println("Your sum is succesfull");
		}
		mRef.addNumbers(100,20);
		mRef.addNumbers(10,200);
		//with methods we achieve modularization
		
		
		
		//2. static methods
		// we need objects of class
		
		Methods.addNumbersagain(11, 12);
		Methods.addNumbersagain(15, 12);
		Methods.addNumbersagain(16, 12);
		
		

	}

}

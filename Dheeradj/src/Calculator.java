// Author: Dheeradj Hardwarsing
// Github: github.com/Dheeradj
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a,b,ch,answer;
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Write the first number: ");
		 a = scanner.nextInt();
		 
		 System.out.println("Write the first number: ");
		 b = scanner.nextInt();
		 
		 System.out.println("Enter the operation you want:");
		 System.out.println("1. Addition");
		 System.out.println("2. Subtraction");
		 System.out.println("3. Multiplication");
		 System.out.println("4. Defition");
		 
		 System.out.println("Write the first number: ");
		 ch = scanner.nextInt();
		 
		 
		 switch(ch) {
		 case 1:
			 answer=a+b;
			 System.out.println(a+" + "+b+" = "+answer);
			 break;
		
		 case 2:
			 answer=a-b;
			 System.out.println(a+" - "+b+" = "+answer);
			 break;
		 case 3: 
			 answer=a*b;
			 System.out.println(a+" x "+b+" = "+answer);
			 break;
		 case 4:
			 answer=a/b;
			 System.out.println(a+" / "+b+" = "+answer);
			 break;
			 
		 default:
			 System.out.println("Write a integer number");
		 }
		 
		 
		 
	}
	

}

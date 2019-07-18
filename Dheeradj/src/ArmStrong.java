// Author: Dheeradj Hardwarsing
// Github: github.com/Dheeradj
import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		 int number, temp, total = 0;
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Write a number: ");
		 int num = scanner.nextInt();

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number= number/10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	    
	

	}

}

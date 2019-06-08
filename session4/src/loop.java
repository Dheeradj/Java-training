import java.util.Scanner;//
public class loop {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in); //system.in will perform read from console
		System.out.println("Enter a number: ");	//will perform write from console
		
		int number = scanner.nextInt(); //read an integer which user will enter on console
		System.out.println("You entered "+ number);
		scanner.close();//to remove from memory
		
	/*	int i=1;
			System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
		System.out.println(number+" "+i+"'s are"+(number*i));
		i++;
	*/
		
	/*	System.out.println("Table of"+number+" is: ");
		int i=1;
		while (i<=10) {
			System.out.println(number+" "+i+"'s are"+(number*i));
			i++;
		}
		
		System.out.println();
		number++;
		do {
			System.out.println(number+" "+i+"'s are"+(number*i));
			i++;
			
		}while (i<=10);
		
		
		
				
		System.out.println(i);
		
		number=i++;
		System.out.println();
		for(i=1;i<=10;i++) {
			System.out.println(">>"+number+" "+i+"'s are"+(number*i));
		}
	*/
		
		
		
		for(int num = 5, i=1;i<=10;i++){
			System.out.println(">> "+num+" "+i+"'s are "+(num*i));

		
		}
	}

}

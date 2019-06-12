import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the size of your array: ");
		int n=s.nextInt();
		
		int arr[]= new int[n];
		//System.out.println("Enter your element: ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the: "+(i+1)+" number: ");
			
			arr[i]=s.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Sum: "+sum);

}
}
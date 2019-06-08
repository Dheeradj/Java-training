
public class ReferenceCopy {

	public static void main(String[] args) {
		
		
		int num =10;
		int[]numbers= {10,20,30,40,50};
		
		int num1 = num;//value copy
		int[] numbers1 = numbers;//hash code copy
		
		System.out.println("Num is: "+num);
		System.out.println("Num1 is: "+num);
		System.out.println("Number is: "+numbers);
		System.out.println("Number1 is: "+numbers1);
		
		
		numbers1[3]=111;
		numbers1[1]=555;
		
		for(int elm: numbers) {
			System.out.println(elm+" ");
		}

	}

}

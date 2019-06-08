
public class MVC {

	public static void main(String[] args) {
		//single value container
		int num =10;
		 
		//Multi valued container: Array
		//Array are homogeneous
		int[] numbers= {10,20,30,40,50};
		
		// Read containers
		System.out.println("Num is:"+num);

		System.out.println("Number is:"+numbers);
		
		//num contains value -> primitive
		//number contains Hashcode -> reference variable
		
		
		//update data in multivalue container
		numbers[1]= 222;
		System.out.println("Number is:"+numbers[1]);
		System.out.println("Number is:"+numbers[3]);
		
		//read all
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]+" ");
		}
		
		//developrs friendly loop
		for(int elm  : numbers) {
			System.out.println(elm+" ");
		}
	}
}

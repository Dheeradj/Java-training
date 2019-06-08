
public class ArraysSyntaxes {

	public static void main(String[] args) {
		//1. bracket before
		int []a1= {10,20,30,40,50};//implicit statement
		//2. bracket after
		int a2[]= {40,50,60,70,80};
		//3. with new keyword, it is a explicit statement
		int a3[]= new int[] {10,20,30,40,50};//will create new int array with this data in heap at runtime
		//further return a hashcode of created array in heap and store it in a3
		//4. with size
		 int[] a4= new int [10];//create an array with 10integers having all as value 0
		
		 a4[1]=111;
		 a4[9]=999;
		 a4[1]=1000;
		 for (int elm :a4) {
			 System.out.println(elm+" ");
		 }
	
	}

}

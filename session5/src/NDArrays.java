
public class NDArrays {

	public static void main(String[] args) {
		
		//array of arrays and nt a matrix
		//we can represent matrix with array of array
		int[][] arr= {
				{10,20,30},
				{10,20},
				{10,20,30,40,50},
				{10,20,30,40},
				{10}
		};
		System.out.println("Arr is: "+arr+" and lenght"+arr.length);

		//System.out.println("Arr[0] is: "+arr[0]+" and lenght"+arr[0].length);
		
//		for(int i=0;i<arr;i++) {
//			System.out.println("Arr["+i+"]is "+ arr[i]+"and length is "+arr[i].length);
			
			for (int i= 0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {//i:0;j:3;
					System.out.println(arr[i][j]+" ");
				}
				System.out.println();
			}
			//draw array in memory heap
			//nd array is collection of n-1 d arrays
		}
//		System.out.println(arr[1][1]);
	
	

}

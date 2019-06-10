
public class ValueVRef {

	static void squareOfNum(int num) {//passing value /copying the data
		num=num*num;
		System.out.println("Num is: "+num);
	}
	
	
	static void squareOfNumb(int[] nums) {//passing value reference(copying the hashcode)
		System.out.println("Nums: "+nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =10;
		squareOfNum(number);//only if main and squareOfNum is in the same class
		
		
		int []arr= {1,2,3,4,5};
		System.out.println("array is: "+arr);
		squareOfNumb(arr);
		
		for(int elm : arr) {
			System.out.println(elm+" ");
		}
	}

}


public class Operators {

	public static void main(String[] args) {
		
		
		int x = 12; //1100
		int y = 3;
		//int z= x>>y; //11000>>3
					// ---1->0001->1
		
		int z=x<<y;	// 12-> 0000 0000 0110 0000
		System.out.println("Z is: "+z);
		
		
		
		int actualData = z>>y;
		System.out.println("Actual data is"+ actualData);
		
		
		
		x=-13;	//1011
		y=2;	
		z=x>>y;	//_ _ 10->0010
				//1011
				//0100
				//   1
				//0101
				//__01->1101
		
				//1101
				//0010
				//	 1
				//0011->-3
		System.out.println("Z is"+z);
		
		x=12;		//1100
		y=8;		//1000
		int z1=x&y;	//1000
		int z2=x|y;	//1100
		int z3=x^z;	//0100
		System.out.println("Z1="+z1);
		System.out.println("Z2="+z2);
		System.out.println("Z3="+z);
	}

}

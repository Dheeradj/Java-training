
public class nestedLoop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			//System.out.println("I is: "+ i);
			
			for (int j=1;j<=i;j++) {
				//System.out.println("J is: "+j);
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
/*
 * 
 * 1
 * 23
 * 456
 * 7890
 */

public class breakAndContinue {

	public static void main(String[] args) {
		int myFloor= 5;
		for(int i=1;i<=10;i++) {
			System.out.println("Flaar number: "+i);
			
			if(i == myFloor) {
				System.out.println("Iam on my floor :)");
				break;
			}
		}
		
		for(int i = 1;i<=10;i++) {
			if (i<5) {
				continue;// continue skips the statements below and moves to next iterative
			}
			System.out.println("I is: "+i );
		}

	}//hw explore 

}

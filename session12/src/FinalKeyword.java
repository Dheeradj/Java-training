final class Parent{// cannot be extended
	final void PurchaseBike(){
		System.out.println("Buy bajaj pulsar");
	}
}

//class child extends Parent{
//	void PurchaseBike() {
//		System.out.println("Royal Enfield");
//	}
//}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i= 10;
		i=100;
		
		//final variable
		final int j=10;
//		j=200; cannot be modified
		//final j cannot be modified and its a read-only container
		
		
		//blank final variable
		final int k;
		k = 10;
//		k = 1000; error
		
	}

}

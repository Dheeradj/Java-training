
public class hw {
	
	
	static double getDiscountAfterPromoCode(int code, double amount){
		
		double discount = 0.0;
//		if (amount<200) {
//			discount=0;
//		}
			
		if(code == 1 && amount>1000){
			discount = amount*(50.0/100.0);
		}else if(code == 2 && amount>500 && amount<1000){
			discount = amount*(30.0/100.0);
		}else if(code == 3 && amount>200 && amount<500){
			discount = amount*(10.0/100.0);
		}else{
			System.out.print("The promo code: "+code+" is not available please enter: ");
			if (amount>1000) {
				System.out.println("promocode 1");
			}else if(amount>500 && amount<1000) {
				System.out.println("promocode 2");
			}else if (amount>200 && amount<500) {
				System.out.println("promocode 3");
				
			}
			
		}
		
		return discount;
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		double total=1200;
		
		double disc = hw.getDiscountAfterPromoCode(5, total);
		
			System.out.println(">> Please Pay: \u20b9"+(total - disc));
		
//		if(disc==0) {
//			System.out.println("Enter a correst promocode");
//		}

	}

}

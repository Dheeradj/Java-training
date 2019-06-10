
public class MethodsDemo {
	
/*		static void applyPromoCode(int code, double amount){
//		
//		if(code == 1){
//			double discount = amount*(50.0/100.0);
//			amount = amount - discount;
//			System.out.println(">> Please Pay: \u20b9"+amount);
//		}else if(code == 2){
//			double discount = amount*(30.0/100.0);
//			amount = amount - discount;
//			System.out.println(">> Please Pay: \u20b9"+amount);
//		}else if(code == 3){
//			double discount = amount*(10.0/100.0);
//			amount = amount - discount;
//			System.out.println(">> Please Pay: \u20b9"+amount);
//		}else{
//			System.out.println(">> No Discount. Please Pay: \u20b9"+amount);
//		}
//		
//	}	
*/
		
		static double getDiscountAfterPromoCode(int code, double amount){
				
				double discount = 0.0;
				
				if(code == 1){
					discount = amount*(50.0/100.0);
				}else if(code == 2){
					discount = amount*(30.0/100.0);
				}else if(code == 3){
					discount = amount*(10.0/100.0);
				}else{
					discount = 0.0;
				}
				
				return discount;
			}
	
		public static void main(String[] args) {
		// 1:flat 50	2.:flat 30	3:flat 10
		int total=2000;
		
		//MethodsDemo.applyPromoCode(3,total);
		
		
		double disc = MethodsDemo.getDiscountAfterPromoCode(1, total);
		System.out.println(">> Please Pay: \u20b9"+(total - disc));
	}

}

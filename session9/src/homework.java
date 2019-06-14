import java.util.Scanner;

class Order{
	
	String foodname;
	String size;
	double price;
	
	
	Order(){
		foodname="No food selected";
		size="no size mentioned";
		price=0;
	}
	Order(String foodname, String size, double price ) {
		this.foodname=foodname;
		this.size=size;
		this.price=price;
	}
	
		
		void getTotalPrice(){
		System.out.println("Your total price is: "+price);
		}
		
		void applyPromoCode(int price, int code, double discount){
			if(code == 1 && price>1000){
				discount = price*(50.0/100.0);
			}else if(code == 2 && price>500 && price<1000){
				discount = price*(30.0/100.0);
			}else if(code == 3 && price>200 && price<500){
				discount = price*(10.0/100.0);
			}else{
				System.out.print("The promo code: "+code+" is not available please enter: ");
				if (price>1000) {
					System.out.println("promocode 1");
				}else if(price>500 && price<1000) {
					System.out.println("promocode 2");
				}else if (price>200 && price<500) {
					System.out.println("promocode 3");
				}
				}
		}
	
		void sortFoodItems( ){
			int n;
			int temp;
			Scanner s = new Scanner(System.in);
		    System.out.print("Enter number of items:");
		    n = s.nextInt();
		    int a[] = new int[n];
		    System.out.println("Enter all the food_id :");
		    for (int i = 0; i < n; i++) 
		    {
		        a[i] = s.nextInt();
		    }
		    for (int i = 0; i < n; i++) 
		    {
		        for (int j = i + 1; j < n; j++) 
		        {
		            if (a[i] > a[j]) 
		            {
		                temp = a[i];
		                a[i] = a[j];
		                a[j] = temp;
		            }
		        }
		    }
		    System.out.print("Ascending Order:");
		    for (int i = 0; i < n - 1; i++) 
		    {
		        System.out.print(a[i] + ",");
		    }
		    System.out.print(a[n - 1]);
		}
		
		void setOrderDetails(String foodname, String size, double price ) {
			this.foodname=foodname;
			this.size=size;
			this.price=price;
		}
		
		
		void showOrderDetails(){
			System.out.println("=================");
			System.out.println("Foodname:	"+foodname);
			System.out.println("Size:		"+size);
			System.out.println("Price		"+price);
			System.out.println("=================");
		}
	}
	
	class FoodItem{
		int foodid;
		String foodname;
		double price;
		
		
		FoodItem(){
			foodid = 0 ;
			foodname = "no food name given";
			price = 0.0;
		}
		
		FoodItem(int foodid, String foodname, double price){
			this.foodid=foodid;
			this.foodname=foodname;
			this.price=price;
		}
		
		void updateFoodItem(int foodid, String foodname, double price){
			this.foodid=foodid;
			this.foodname=foodname;
			this.price=price;
		}
		
		void showOrderDetails(){
			System.out.println("=================");
			System.out.println("Foodid:			"+foodid);
			System.out.println("Foodname:		"+foodname);
			System.out.println("Price:			"+price);
			System.out.println("=================");
		}
		
	}
	
	
	
public class homework {
	
	public static void main(String[] args) {
		Order o1 = new Order("Pasta", "small",25.50);
		o1.showOrderDetails();
		o1.getTotalPrice();
		
		o1.sortFoodItems();
		
    }

	}



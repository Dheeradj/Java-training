class prod{
	int pid;
	String name;
	 String brand;
	int price;
	
	prod(){
		System.out.println("Product object constructed");
	}
	
	void setProductDetails(int pid, String name, String brand, int price){
		System.out.println("Parent set product details");
		this.pid=pid;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	void showProductDetails(){
		System.out.println("====================");
		System.out.println("Parent show product details");
		System.out.println("PID :      "+pid);
		System.out.println("Name:      "+name);
		System.out.println("brand:      "+brand);
		System.out.println("price:      "+price);
		
		System.out.println("====================");
	}
}




class mobile extends prod{
	
	mobile(){
		System.out.println("Mobile object constructed");
	}
	
	
	void setProductDetails(int pid, String name, String brand, int price){
//		super.setProductDetails(2, "samsung", "j", 839);
		System.out.println("Parent set product details");
		this.pid=pid;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	
	
	void showProductDetails(){
//		super.showProductDetails();
		System.out.println("====================");
		System.out.println("PID :      "+pid);
		System.out.println("Name:      "+name);
		System.out.println("brand:      "+brand);
		System.out.println("price:      "+price);
		
		System.out.println("====================");
	}
}
public class ISAAGAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mobile m1 = new mobile();
		m1.setProductDetails(1, "Iphone", "apple", 999);
		
		m1.showProductDetails();
	}

}

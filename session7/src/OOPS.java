/*
 	
 	OOPS : Object Oriented Programming Structure
 		   Object
 		   Class
 		   
 	Real World:
 		   Object is anything which we can see and touch
 		   Object is a Reality or Real Thing -> Real Time Entity
 		   
 		   Class is drawing of an Object
 		   
 		   What will you think of first ? Class or Object ??
 		   
 		   1. Think of Object
 		   2. Create its Drawing
 		   3. Looking into the Drawing create a Real Object
 		   
 	Computer Science:
 		   Object : Multi Value Container. Its a Box which shall contain data !!
 		   	        Homo or Hetro
 		   	        
 		   Class  : Textual Representation how an object will look like
 		   	        Description of Object
 		   	        
 		   Requirement: Create an Application where user will register. 
 		   User should be able to add food items to cart. Than make a payment.
 		   We will connect the request to Restaurant and assign a Delivery Person to deliver food item	        
 		   
 		   Model View Controller Architecture
 		   Model :  Means Data
 		   Object : Data Storage Container
 		   
 		   1. Identify Object
 		      Whatsoever term will have lot of data associated with it is an Object
 		      eg: User, FoodItem, Restaurant, Payment, DeliverPerson etc..
 		      		 		      		
 		   2. Think of Object 
 		   		User
 		   			name
 		      		phone
 		      		email
 		      		gender
 		      		age
 		      		address
				User is an Object and data associated is called its attributes
					
 		   3. Draw Object i.e. Create its class -> Textual Representation
 		   
 		   4. Create a Real Object from Class
 	
 */

//textual representation of object
// what you need in your object , you can write!!
class User{
	// Attributes: Property of User Object and not of class
	String name;
	long phone;
	String email;
	byte age;
	char gender;
	String address;
	
	// Methods: Property of User Object and not of class
	// non static method is property of Object
	// For Write Operation
	void setDetailsOfUser(String n, long p, String e, byte a, char g, String ad){
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	// For Read Operation
	void showDetailsOfUser(){
		System.out.println("==========================");
		System.out.println("Name:\t"+name);
		System.out.println("Phone"+phone);
		System.out.println("Eamil:\t"+email);
		System.out.println("Age:\t"+age);
		System.out.println("Gender:\t"+gender);
		System.out.println("Address:\t"+address);
		System.out.println("==========================");
	}
}

class FoodItem{
	String name;
	String description;
	int price;
	char type;
}



public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object construction
		int i =10;
		
		int[]arr=new int[] {10,20,30,40,50};
		
		//object construction
		User uRef1=new User();//reference variable
		User uRef2=new User();
		User uRef3= uRef1;
		//uref1-uref3 are reference variable and contains hashcode of object
		// new creates object which is a container in the heap area at run time 
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
	
		
		
		//1. write data in object
		uRef1.name = "John";
		uRef1.phone = 9999988888l;
		uRef1.email = "john@example.com";
		uRef1.age = 30;
		uRef3.gender = 'M';
		uRef3.address = "Redwood Shores";
		
		
		uRef2.name = "Fionna";
		uRef2.phone = 9999977777l;
		uRef2.email = "fionna@example.com";
		uRef2.age = 33;
		uRef2.gender = 'F';
		uRef2.address = "Country Homes";
		
		
		// 2. update data in object
		uRef1.name="John Whatson";
		uRef2.name="Fiona Flynn";
		
		//read data from object
		
		//System.out.println(uRef1.name+" is "+uRef3.age+" years old and lives in "+uRef1.address);
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		uRef1.showDetailsOfUser();
		uRef2.showDetailsOfUser();
		
		// 4. Delete Operation
			// Objects are deleted automatically in Java by Garbage Collector which is in JVM
		
	}
	

}

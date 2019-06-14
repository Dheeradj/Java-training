//class Parent{
//	
//	//constructor will be executed when memory will be created in memory
//	Parent(){
//		System.out.println("Parent object constructed");
//	}
//}
//
//class Child extends Parent{//extends ->relationship| inheritence
//	Child(){
//		System.out.println("Child object constructed");
//	}
//}



//whatever we write in parent class is property of object
class Parent{
	//property of object|non-static
	String fname;
	String lname;
	int money;
	
	//constructor will be executed when memory will be created in memory
	Parent(){
		System.out.println("Parent object constructed");
	}
	
	//property of parent object
	void setDetails(String fname, String lname, int money) {
		this.fname=fname;
		this.lname=lname;
		this.money=money;
	}
	
	void showDetails() {
		System.out.println("=================");
		System.out.println("fname is:   "+fname);
		System.out.println("lname is:   "+lname);
		System.out.println("money is:   "+money);
		System.out.println("=================");
	}
}

class Child extends Parent{//extends ->relationship| inheritence
	String fname;
	String lname;
	int money;
	
	void setDetails(String fname, String lname, int money) {
		super.setDetails("Goerge", lname, 2000000);
		this.fname=fname;
		this.lname=lname;
		this.money=money;
	}
	//overriding: something that is with the parent it must be with the child 
	void showDetails() {
		super.showDetails();
		System.out.println("******************");
		System.out.println("fname is:   "+fname);
		System.out.println("lname is:   "+lname);
		System.out.println("money is:   "+money);
		System.out.println("=******************");
	}
	Child(){
		System.out.println("Child object constructed");
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent p1 = new Parent();
		Child c1 = new Child();
		
		//Rule 1: When we give a command to create a object of child,
//		object of parent is created before object of child in memory
		
		c1.setDetails("Johnt", "Whatson", 10000);
		
		
		//rule 2: whatsoever is in the parent object can be accessed by Child object,
//		if something is private child can not exit it
		
		c1.showDetails();
		
		
		//Rule 3. if child has attributes all method which is in the parents as well
		// in this case child will acces its own data its own attributtes or methods
	}
	

}

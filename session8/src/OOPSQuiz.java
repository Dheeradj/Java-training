class Counter{
	//Attribute: property of class
	static int scount;
	
	//Attribute: property of object
	int count;
	
	//Constructor: Property of Object		| Executed whe object is created in memory
	Counter(){
		count = 1;
		scount = 1;
		
	
	}
	
	//Method: Business Method (Because it will have some logical instruction)
	void incrementCount() {
		count++;
		scount++;
		
		
	}
	
	//Read method
	void showCounter() {
		System.out.println("Count is: "+count+" and scount is: "+scount);
	}
}
public class OOPSQuiz {

	public static void main(String[] args) {
		Counter c1 = new Counter(); // Object Construction Statement
		Counter c2 = new Counter(); // Object Construction Statement
		Counter c3 = c1; 		    // Reference Copy
		
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c3.incrementCount();
		c3.incrementCount();
		c1.incrementCount();
		
		c2.incrementCount();
		
		//Counter c4 = new Counter();
		
		
		c1.showCounter();
		c2.showCounter();
		c3.showCounter();
		//c4.showCounter();
	}

}

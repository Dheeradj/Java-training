interface Inf1{
	int i=10; //public static final int i=10;
	void show();
	void fun();
	
	
}
// rule book
interface Inf2{
	int i=100;
	void fun();
	void hello();

}


//3. Interface to interface
// Multiple Inheritance is supported

interface Inf3 extends Inf2, Inf1{
	
}


//Multiple Implementation and not multiple inheritance
class CA implements Inf3{//inf1, inf2
	public void show() {
		System.out.println("This is show");
	}
	
	public void fun() {
		System.out.println("This is fun");
	}
	
	public void bye() {
		System.out.println("This is bye");
	}
	
	public void hello() {
		System.out.println("This is hello");
	}
}



public class InterFaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Direct Object Construction
		CA cRef1 = new CA() ;
			cRef1.show();
			cRef1.fun();
			cRef1.bye();
			
		//2. Polymorphic Statement: ref Var of inheritance can access the Object which implements it
			Inf1 iRef1 = new CA();
			iRef1.show();
			iRef1.fun();
//			iRef1.bye();  error
//			iRef1.hello(); error
			
			
			Inf2 iRef2 = new CA();
//			iRef2.show(); error
			iRef2.fun();
//			iRef2.bye();  error
			iRef2.hello();
			
//			System.out.println("I is: "+CA.i);
			System.out.println("Inf1 i is: "+Inf1.i);
			System.out.println("Inf2 i is: "+Inf2.i);
			
			Inf3 iRef3 = new CA();
			iRef3.show();
			iRef3.fun();
			iRef3.hello();
//			iRef3.bye(); error
			
			

	}

}

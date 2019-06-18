

public class StaticBlock {
	{
		System.out.println("This is a block");
	}
	
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main started");
		
		StaticBlock sRef = new StaticBlock();
		
		System.out.println("Main finished");

	}

}

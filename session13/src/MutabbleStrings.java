
public class MutabbleStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "HEllo";
		s1.concat("WORLD");
		System.out.println("S1: "+s1);
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("Builder is: "+builder);
		
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("Buffer is: "+buffer);
		
	}

}

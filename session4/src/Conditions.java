
public class Conditions {
	
	public static void main(String [] args) {
		final int olaMicro= 1; //final is a constant
		int olaMini= 2;
		int olaSedan=3;
		int olaShare=4;
		int olaBike=5;
		
		int selectedTypeOfCab= olaMini;
		//Ladder if else
		
//		if(selectedTypeOfCab==olaMicro) {
//			System.out.println("Olla micro cab is booked. Please pay 100");
//		}else if(selectedTypeOfCab==olaMini) {
//			System.out.println("Olla mini cab is booked. Please pay 120");
//		}else if(selectedTypeOfCab==olaSedan) {
//			System.out.println("Olla sedan cab is booked. Please pay 150");
//		}else if(selectedTypeOfCab==olaShare) {
//			System.out.println("Olla share cab is booked. Please pay 10");
//		}else if(selectedTypeOfCab==olaBike) {
//			System.out.println("Olla bike cab is booked. Please pay 20");
//		}
//		
		
		
		switch(selectedTypeOfCab)
		{
		case olaMicro:
			System.out.println("Olla micro cab is booked. Please pay 100");
			break;
			
		case 2:
			System.out.println("Olla mini cab is booked. Please pay 120");
			
			break;
		
		
		case 3:
			System.out.println("Olla sedan cab is booked. Please pay 150");
			break;
		
		
		case 4:
			System.out.println("Olla share cab is booked. Please pay 10");
		
		break;
		
		case 5:
			System.out.println("Olla bike cab is booked. Please pay 20");
			
			break;
			
			
		default:
			System.out.println("No such rides select a valid ride");
			break;
		}
	}

}

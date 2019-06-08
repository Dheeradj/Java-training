
public class WhyArrays {

	public static void main(String[] args) {
		
		//method 1 static approach
		int popLdh= 200012;
		int popJal=55132;
		int popAsr = 432110;
		int popFrz= 25;
		int popBat=1498579;
		
		int punjabPopulation= popLdh+popJal+popAsr+popFrz+popBat;
		System.out.println("Population is:"+punjabPopulation);
		
		
		//method 2 easier
		
		int[] population= {200012,55132,432110,25,1498579};
			
		int count = 0;
		for(int elm:population) {
			count = count+elm;
		}
		System.out.println("Population is:"+count);
		
		
		for(int i=0;i<population.length;i++) {
			if(population[i]==25) {
				System.out.println("IDX is: "+i);
			}
		}
	}
	


}

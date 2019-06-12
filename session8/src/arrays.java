
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10,200,3,40,540,60,70,80};
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				int firstEle=array[i];
				int secondEle=array[j];
				
				if(secondEle<firstEle) {
					int temp=firstEle;
					firstEle=secondEle;
					secondEle=temp;
					
					array[i]=firstEle;
					array[j]=secondEle;
					
				}
			}
			System.out.println();
			for(int k=0;k<array.length;k++) {
				System.out.print(" "+array[k]+" ");
			}
		}

	}

}

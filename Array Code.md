
public class ArraysV2 {
	
	public static void main(String[] args)
	{
		int [] Array_A = {4,5,10,11,6,};
		int M=-1,i=1;
		
		System.out.println("All the pairs of numbers that,if subtracted from the Array_A"
				+ " are equal with "+M +", are : ");
		
		for(int item1 : Array_A) 
		{
			
			for(int item2 : Array_A) 
			{
				
				if((item1-item2)==M) 
				{				
					
					System.out.println("Pair " +i + ": "+ item1 + "-" + item2+"="+M);
					i++;
					
				}				
			}
		}
	}
}

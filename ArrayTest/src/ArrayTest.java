import java.util.Random;

class ArrayTest {
   
	public static void main(String[] args) {
 
      long startTime = System.currentTimeMillis();
       long total = 0;
      
       for (int i = 0; i >= 0; i++) {
         total += i;
      }
  
       int [] Array_A = {4,5,10,11,6};   
    
 /*      Random rand = new Random();
      int [] Array_A = new int[200000];
           

      for(int k=0;k<10;k++) {
    	 
    	  Array_A[k]=rand.nextInt(10);
    	 
      }
  */
 
		
   /*     int [] Array_A = new int[200000];
       
       for(int n=0;n<Array_A.length;n++) {
    	   Array_A[n]=n;
       }
   */
      
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
		
      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println("Elapsed Time :"+elapsedTime+" ms");
      
      
   
      Runtime rt = Runtime.getRuntime();
      long usedMB = (rt.totalMemory() - rt.freeMemory()) / 1024; 
      System.out.println("Memory usage " + usedMB + " Kb");
   }
}

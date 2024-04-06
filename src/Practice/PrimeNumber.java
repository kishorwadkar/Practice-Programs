package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
	
      int num=2;
      int i=0;
      int count=0;
      while(count<100)
      {
    	  for( i=2;i<num;i++)
    	  {
    		  if(num%i==0)
    		  {
    			  break;
    			  
    		  }
    		 
    		 
    		  
    	  } 
    	  if(i==num)
		  {
			  count++;
			  System.out.println(i);
		  }
    	   num++;
    	
      }
   
	}

}

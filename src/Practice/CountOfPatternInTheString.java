package Practice;

public class CountOfPatternInTheString {

	public static void main(String[] args) {

		String pat = "abc";  
		String txt = "abcdefabcdef";     
		int M = pat.length();    //2     
		int N = txt.length();  //11     
		int res = 0; 

		/* A loop to slide pat[] one by one */
		for (int i = 0; i <= N - M; i++) 
		{        //9
			/* For current index i, check for  
		        pattern match */
			int j;             
			for (j = 0; j < M; j++) 
			{                          //2
				if (txt.charAt(i + j) != pat.charAt(j)) 
				{ 
					break; 
				} 
			} 

			// if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
			if (j == M)
			{                 
				res++;                 
				j = 0;                 
			}             
		}         
		System.out.println("the count is :"+res);

	}

}

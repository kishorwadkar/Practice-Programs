package Practice;

public class CountPatternInsideAString1 
{


	public static void main(String[] args) 
	{
		String txt="abcdabcdefghijklmabcdnoprstuvwxyz";
		String pattern="abcd";
		int txtLngth=txt.length();
		int patternLength=pattern.length();
		
		String sarray[]=new String[txtLngth-3];
		int end=4;
		int count=0;
		
		for(int start=0;end<=txtLngth;end++)
		{
			String s=txt.substring(start, end);
			sarray[start]=s;
			start++;
			
		}
		
		for(int i=0;i<sarray.length;i++)
		{
			if(sarray[i].equals(pattern))
			{
				count++;
			}
			
		}
		System.out.println( "Pattern count in the Given String is = "+count);
		


	}

}

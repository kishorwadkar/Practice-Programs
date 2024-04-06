package Practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromTheString {

	public static void main(String[] args) 
	{
		String name="wadkar";
		
		int l=name.length();
		char a[]=name.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<l;i++)
		{
			set.add(a[i]);
		}
		
		for(Character b:set)
		{
			System.out.print(b);
		}
		
		

			
				

		

	}



}



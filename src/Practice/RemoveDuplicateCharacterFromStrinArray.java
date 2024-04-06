package Practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromStrinArray {

	public static void main(String[] args) 
	{
		
		String a[]= {"aamayra","namrata","priyanka"};
		
	
		for(String name:a)
		{
			LinkedHashSet<Character>set=new LinkedHashSet<>();
			char c[]=name.toCharArray();
			int l=c.length;
			
			for(int i=0;i<l;i++)
			{
			set.add(c[i]);
			}
			for(char f:set)
			{
				System.out.print(f);
			}
			System.out.println();
			
		}
		
		
		

	}

}

package Practice;

import java.util.HashMap;

public class CountOfDuplicatehraterInStringArray {

	public static void main(String[] args) 
	{
		
		String name[]= {"aameyara","namrata","priyanka"};
		for(String s:name)
		{
			char c[]=s.toCharArray();
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			for(char d:c)
			{
				if(map.containsKey(d))
				{
					map.put(d,map.get(d)+1);
				}
				else
				{
					map.put(d,1);
				}
				
			}
			System.out.println(map);
			
			
		}

	}

}

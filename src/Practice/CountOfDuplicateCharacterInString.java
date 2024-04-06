package Practice;

import java.util.HashMap;

public class CountOfDuplicateCharacterInString {

	public static void main(String[] args) 
	{

		String name="aamayara";
		char c[]=name.toCharArray();
		HashMap<Character,Integer>Hash=new HashMap<Character,Integer>();
		for(char d:c)
		{
			if(Hash.containsKey(d))
			{
				Hash.put(d, Hash.get(d)+1);
			}
			else
			{
				Hash.put(d, 1);
			}
		}

		System.out.println(Hash);
	}

}

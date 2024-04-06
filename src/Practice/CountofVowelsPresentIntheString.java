package Practice;

public class CountofVowelsPresentIntheString
{
	static int CountA=0,CountE=0,CountI=0,CountO=0,CountU=0,totalCount=0; 

	public static void main(String[] args) {
		String name="congratulations";
		String name11 = name.toLowerCase();
		int l=name11.length();
		char c[]=name11.toCharArray();
		//int totalCount=0;
		for(char d:c)
		{
			switch(d)
			{
			case 'a': CountA++;
			break;
			case 'e': CountE++;
			break;
			case 'i': CountI++;
			break;
			case 'o': CountO++;
			break;
			case 'u': CountU++;
			break;
			
//			default:
//				System.out.println("There is no vowel present in the String");
//			

			}
		}
		
		System.out.println("Count of vowel a present in the String is ="+ CountA);
		System.out.println("Count of vowel e present in the String is ="+ CountE);
		System.out.println("Count of vowel i present in the String is ="+ CountI);
		System.out.println("Count of vowel o present in the String is ="+ CountO);
		System.out.println("Count of vowel u present in the String is ="+ CountU);
		totalCount=CountA + CountE + CountI+ CountO+CountU;
		System.out.println(" Total Count of vowel  present in the String is ="+ totalCount);

	}

}

package Practice;

public class ReversewordInheString {

	public static void main(String[] args) {
		String name="kishor Ashok wadkar";
		int l=name.length();
		String reverseString=" ";
		String split[]=name.split(" ");
		for(String word:split)
		{
			int l1=word.length();
			String reverseWord=" ";
			for(int i=0;i<l1;i++)
			{
				char c=word.charAt(i);
				reverseWord=c+reverseWord;
				
			}
			reverseString=reverseString+reverseWord;
		}
		System.out.println(reverseString);
		
		

	}

}

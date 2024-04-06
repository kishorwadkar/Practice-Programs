package Practice;

public class ReverseString {

	public static void main(String[] args) {
		String name="kishor wadkar";
		String reverseString="";
		int l=name.length();
		for(int i=0;i<l;i++)
		{
			char c=name.charAt(i);
			reverseString=c+reverseString;
			
		}
		System.out.println(" Reverse String = "+reverseString);

	}

}

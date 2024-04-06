package Practice;

public class RemoveExtraSpacesInString {

	public static void main(String[] args) {
	String name="    kishor    Ashok        wadkar     ";
	String name1=name.trim();
	int l=name1.length();
	String correctname="";
	for(int i=0;i<l;i++)
	{
		char c=name1.charAt(i);
		if(name1.charAt(i)==' '&& name1.charAt(i+1)==' ')
		{
			continue;
		}
		else
		{
			correctname=correctname+c;
			
		}
		
	}
	System.out.println(correctname);

	}

}

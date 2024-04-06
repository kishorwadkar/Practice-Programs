package Practice;

public class ReverseStringEx01 {

	public static void main(String[] args) {
		String name="kishor Ashok wadkar";
		String split[]=name.split(" ");
		int l=split.length;
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(" "+split[i]);
		}
		

	}

}

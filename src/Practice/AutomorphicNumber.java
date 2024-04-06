package Practice;

public class AutomorphicNumber {

	public static void main(String[] args) 
	{
		int num=25;
		int l=(""+num).length();
		System.out.println(l);
		int square=num*num;
		double lastDigit=square%(Math.pow(10, l));
		if(lastDigit==num)
		{
			System.out.println("given number is Automorphic number");
			
		}
		else
		{
			System.out.println("Given number is not the Automorphic number");
		}
		

	}

}

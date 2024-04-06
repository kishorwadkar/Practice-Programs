package Practice;

import java.util.Scanner;

public class AdditionOfNumberTakingUserInput {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you wnat to make addtion");
		int num=sc.nextInt();
		int sum=0;
		System.out.println("Enter the number as Mentioned in above");
		
		for(int i=0;i<=num;i++)
		{
			
			sum=sum+sc.nextInt();
			
		}
		System.out.println("Sum of All Entered number is ="+sum);
		

	}

}

package Practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int add=0;
		for(int i=1;i<num;i++)//6 5
		{
			if(num%i==0)
			{
				add=add+i;
			}
				
		}
		if(add==num)
		{
			System.out.println(num+" is Perfect Number..");
		}
		else
		{
			System.out.println(num+" is Not Perfect Number..");
		}
	}
			

}

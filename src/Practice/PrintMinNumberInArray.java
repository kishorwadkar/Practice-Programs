package Practice;

public class PrintMinNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int l=a.length;
		int temp=a[0];
		for(int i=0;i<l;i++)
		{
			if(temp>a[i])
			{
				temp=a[i];
			}
			
		}
		
		System.out.println("Minimum Number in the Arrray is = "+temp);
		

	}

}

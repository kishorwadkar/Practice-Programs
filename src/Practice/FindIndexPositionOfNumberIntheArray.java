package Practice;

public class FindIndexPositionOfNumberIntheArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		FindIndexPositionOfNumberIntheArray b=new FindIndexPositionOfNumberIntheArray();
		int EnterNum=5;
		int index1=b.findIndexPositionInArray(a, EnterNum);
		System.out.println(" Index position Given number is "+index1);

	}
	
	public int findIndexPositionInArray(int a[], int num)
	{
		int l=a.length;
		int index=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]==num)
			{
				index=i;
			}
			
		}
		return index;
		
	}

}

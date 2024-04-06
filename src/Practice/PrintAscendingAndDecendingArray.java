package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAscendingAndDecendingArray {

	public static void main(String[] args)
	{
		int a[]= {4,9,6,8,2,1,5,3,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
//		Integer c[]= {5,6,8,9,3,4,2,1,7};
//		Arrays.sort(c,Collections.reverseOrder());
		//System.out.println(Arrays.toString(c));
		
		List<Integer> list=new ArrayList<Integer>();
		for(int b:a)
		{
			list.add(b);
		}
		//System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
		

	}

}

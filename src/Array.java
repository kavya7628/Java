import java.lang.System;
import java.util.*;

public class Array {
	public static void main(String args[]) {
		int[] arr= {2,4,6,3,2,4,3,8};
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			for(int j=i+1; j<arr.length-1;j++)
		{
				
			if (arr[i]==arr[j])
				a1.add(arr[i]);	
					
		}	
		
		System.out.println(a1);
	}

}

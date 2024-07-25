import java.lang.System;
import java.util.*;

public class LinearSearch {
	public static void main(String args[]) {
		int[] arr= {2,4,6,8,10};
		Scanner scan = new Scanner(System.in);
		int element=scan.nextInt();
		int Final=0;
		for(int i=0;i<arr.length;i++)
		{
				
			if (element==arr[i]) {
				Final =1;
				System.out.println("The element is present in the array"+i);
				break;
			}}
		
		if(Final==0)
			{
			System.out.println("The element is not present in the array");
				
							
			
	}

	}
}

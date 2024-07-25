import java.util.*;
import java.lang.System;
public class Sorting {
	public static void main(String args[]) {
		int temp;
		int[] arr= {4,2,10,8,6};
		for(int i=0;i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

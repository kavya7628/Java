import java.lang.System;
import java.util.*;
public class BinarySearch {
	public static void main(String args[]) {
		int[] arr= {2,3,5,7,8,9};
		System.out.println("Enter n");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		int result=0;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(n<arr[mid]){
				high=mid-1;
				}
			else if(n>arr[mid]){
				low=mid+1;
				}
			else if(n==arr[mid]){
				mid+=1;
				result=1;
				break;
				}
		}
		if(result==1) {
			
			System.out.println("The value of n is at position "+mid);
			}
		else {
			System.out.println("The value is not in the array");
				
			}
			
		}
		
	}



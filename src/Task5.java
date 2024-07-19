import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class Task5{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	float Principal, rate, n, time;
	System.out.println("Enter the value of Principal: ");
	Principal=scan.nextFloat();
	System.out.println("Enter the value of rate: ");
	rate=scan.nextFloat();
	System.out.println("Enter the value of n: ");
	n=scan.nextFloat();
	System.out.println("Enter the value of time: ");
	time=scan.nextFloat();
	double CompoundInterest=Principal*(Math.pow((1+(rate/n)), (n*time)));
	System.out.println("The Compound Interest is: " +CompoundInterest);
	}
	}
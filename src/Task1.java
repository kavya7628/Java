import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class Task1{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	double a, b, c, s, Area;
	System.out.println("Enter the value of a");
	a=scan.nextDouble();
	System.out.println("Enter the value of b");
	b=scan.nextDouble();
	System.out.println("Enter the value of c");
	c=scan.nextDouble();
	s=(a+b+c)/2;
	Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area of the Triangle is" +Area);
	}
	}
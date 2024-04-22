package LeapYear;

import java.util.Scanner;

public class isLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		
		int n=sc.nextInt();
		if((n%400==0) || (n%4==0) && (n%100!=0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}

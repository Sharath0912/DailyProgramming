package PerfectNumber;

import java.util.Scanner;

public class PerfectNumberApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Perfect perfect=new Perfect();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=perfect.perfectNumber(n);
		if(n==m)
		{
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not A Perfect Number");
		}
	}
}

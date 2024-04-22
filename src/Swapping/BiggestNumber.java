package Swapping;

import java.util.Scanner;

public class BiggestNumber 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int m =sc.nextInt();
		
		if(n>m)
		{
			System.out.println(n+" is Biggest");
		}
		else
		{
			System.out.println(m+" is Biggest");
		}
	}
}

package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Armstrong armstrong = new Armstrong() ;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m= armstrong.isArmstrong(n);
		
		if(n==m)
			System.out.println("ArmStrong");
		else
			System.out.println("Not a ArmStrong");
	}
}

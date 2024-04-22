package PrimeNumber;

import java.util.Scanner;

public class PrimeApp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prime prime=new Prime();
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=prime.isPrime(n);
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not a prime");
	}
}

package PrimeNumberInARange;

import java.util.Scanner;

public class PrimeinRangeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isPrime isPrime=new isPrime();
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) 
		{
			int x=isPrime.isPrimee(i);
			if(x==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}

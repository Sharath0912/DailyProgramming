package Swapping;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int m =sc.nextInt();
		
		int sum=0;
		
		for(int i=n;i<=m;i++) {
			sum+=i;
		}
		System.out.println("Sum Of Numbers In the Range is: "+sum);
	}
}

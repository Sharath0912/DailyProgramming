package Swapping;

import java.util.Scanner;

public class SwappingNumbers 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int m =sc.nextInt();
		int temp;
		
		System.out.println("Before Swapping - n:"+n+" m:"+m);
		temp = n;
		n=m;
		m=n;
		System.out.println("After Swapping - n:"+n+" m:"+m);
	}
}

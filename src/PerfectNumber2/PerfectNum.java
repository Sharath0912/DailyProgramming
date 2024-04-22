package PerfectNumber2;

import java.util.Scanner;

public class PerfectNum 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 num");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		Perfect perfect=new Perfect();
		perfect.isperfect(n, m);
	}
}

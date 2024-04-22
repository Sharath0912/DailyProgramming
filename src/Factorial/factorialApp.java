package Factorial;

import java.util.Scanner;

public class factorialApp 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		factorial factorial=new factorial();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println(factorial.findfactorial(n));
		sc.close();
	}
}

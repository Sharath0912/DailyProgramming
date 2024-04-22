package Fibonacci;

import java.util.Scanner;

public class FibonacciApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Fibonacci fib = new Fibonacci();
		System.out.println("Enter the Limit to print a fibbonacci Series");
		int n=sc.nextInt();
		fib.fibonacci(n);
		sc.close();
	}
}

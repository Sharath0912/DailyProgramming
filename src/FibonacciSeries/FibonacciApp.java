package FibonacciSeries;

import java.util.Scanner;

public class FibonacciApp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of number you want to print in a Fibonacci Series");
		
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.fibonacci(sc.nextInt()));
	}
}

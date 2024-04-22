package FactorialOfNumber;

import java.util.Scanner;

public class FactorialApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Factorial factorial=new  Factorial();
		System.out.println("Enter the Number");
		System.out.println("Factorial is : "+ factorial.fact(sc.nextInt()));
	}
}

package SumofDigits;

import java.util.Scanner;

public class SumofDigitApp 
{
	public static void main(String[] args) {
		SumofDigit digit=new SumofDigit();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(digit.sumOfDigitofNumber(n));
	}
}

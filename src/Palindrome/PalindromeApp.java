package Palindrome;

import java.util.Scanner;

public class PalindromeApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Palindrome palindrome=new Palindrome();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=palindrome.isPalindrome(n);
		if(m==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not A Plaindrome");
		sc.close();
	}
}

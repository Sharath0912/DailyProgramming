package StrongNumber;

import java.util.Scanner;

public class StrongNumberApp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isStrongNumber number = new isStrongNumber();
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int m=number.isStrongNumberr(n);
		
		if(n==m)
			System.out.println("Strong Number");
		else
			System.out.println("Not A Strong Number");
		sc.close();
	}
}

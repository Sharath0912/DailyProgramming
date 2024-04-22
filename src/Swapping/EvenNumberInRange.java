package Swapping;

import java.util.Scanner;

public class EvenNumberInRange 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range to get even numbers in between them");
		int n = sc.nextInt();
		int m =sc.nextInt();
		
		while(n<=m)
		{
			if(n%2==0)
			{
				System.out.print(n+" ");
			}
			++n;
		}
	}
}

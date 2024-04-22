package StongNumberInARange;

import java.util.Scanner;


public class StrongNumberRange 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isStrong_Number strong_Number=new isStrong_Number();
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) 
		{
			int x=strong_Number.isStrongNumberr(i);
			if(x==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}

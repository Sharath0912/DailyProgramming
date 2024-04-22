package PerfectNumberInRange;

import java.util.Scanner;

public class PrintPerfectNumberApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		isPerfect isPerfect=new isPerfect();
		System.out.println("Enter the range");
		int n= sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			if(isPerfect.isPerfectNumber(i))
				System.out.print(i+" ");
		}
	}
}
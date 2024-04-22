package PrintingTable;

import java.util.Scanner;

public class PrintTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to get it's table : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}

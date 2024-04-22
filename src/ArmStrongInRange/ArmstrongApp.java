package ArmStrongInRange;

import java.util.Scanner;

public class ArmstrongApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Armstrong armstrong = new Armstrong() ;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			if(armstrong.isArmstrong(i))
				System.out.print(i+" ");
		}
	}
}

package ArraysProgram_1D;

import java.util.Scanner;

public class DuplicateApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length Of the Array : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Elements of the Array : "); 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Duplicate duplicate= new Duplicate();
		duplicate.isDuplicate(arr);
	}
}

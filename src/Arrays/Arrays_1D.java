package Arrays;

import java.util.Scanner;

public class Arrays_1D 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length Of the Array : ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Elements : "); 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Array Elements Are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

package Array_Searching;

import java.util.Scanner;

public class LinearSearch 
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
		System.out.println("Enter the Key Element to Search : ");
		int key=sc.nextInt();
		
		int index=linearSearch(arr,key);
		
		if(index != -1)
		{
			System.out.println("Element Found At "+index+"...!");
		}
		else
			System.out.println("Element Not Found....!");
		
	}

	public static int linearSearch(int[] arr, int key) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
}

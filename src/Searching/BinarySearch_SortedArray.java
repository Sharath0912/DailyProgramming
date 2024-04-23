package Searching;

import java.util.Scanner;

public class BinarySearch_SortedArray 
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
		
		int index=binarySearch(arr,key);
		
		if(index != -1)
		{
			System.out.println("Element Found At "+index+"...!");
		}
		else
			System.out.println("Element Not Found....!");
	}

	public static int binarySearch(int[] arr, int key) 
	{
		int low = 0;
		int high = arr.length;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}
}

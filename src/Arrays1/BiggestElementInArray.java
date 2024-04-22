package Arrays1;

import java.util.Scanner;

public class BiggestElementInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int big=0;
		
		System.out.println("Enter the size of the array:");
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Enter elements to get Biggest Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>big)
				big=arr[i];
		}
		System.out.println("Sum of Array Elements is : "+big);
	}
}

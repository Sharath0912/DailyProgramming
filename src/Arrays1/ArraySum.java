package Arrays1;

import java.util.Scanner;

public class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Enter the size of the array:");
		int [] arr = new int[sc.nextInt()];
		
//		//To Get Input
//		System.out.println("Enter the Array Elements:");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		//To display Sum
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		System.out.println("Sum of Array Elements is : "+sum);
		
		System.out.println("Enter elements to get sum");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Elements is : "+sum);
	}
}

package Arrays;

import java.util.Scanner;

public class Arrays_2D_Ex2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [4][3];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the heights of the game "+i+" player "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

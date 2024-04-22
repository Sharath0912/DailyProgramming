package Arrays;

import java.util.Scanner;

public class Array_2D_Ex1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Columns: ");
		float [][]arr = new float [sc.nextInt()][sc.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the marks of class "+i+" of student "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Contents Are...");
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

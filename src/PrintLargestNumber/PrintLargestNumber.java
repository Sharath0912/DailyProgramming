package PrintLargestNumber;

import java.util.Scanner;

public class PrintLargestNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,large=0,ele;
		
		System.out.println("Enter the number Of elements");
		n=sc.nextInt();
		
		System.out.println("Enter the Elements");
		for(int i=1;i<=n;i++)
		{
			ele=sc.nextInt();
			if(ele>large)
			{
				large=ele;
			}
		}
		System.out.println("The largest among them : "+large);
	}
}

package Fibonacci;

public class Fibonacci 
{
	public void fibonacci(int n)
	{
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	//OR Using the recursive method
	
}

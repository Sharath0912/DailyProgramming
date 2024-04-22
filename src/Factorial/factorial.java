package Factorial;

public class factorial 
{
	public int findfactorial(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
		// Using While:
		
//		int a=1;
//		int fact = 1;
//		while(a<=n) {
//			fact=fact*a;
//			a++;
//		}
//		return fact;

		//do while
	}
}

package StrongNumber;

public class isStrongNumber 
{
	public int isStrongNumberr(int n) 
	{
		int rem=0;
		int sum=0;
		
		while(n>0)
		{
			rem=n%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		return sum;
	}
	
	//It works but try 1st way
	
//	public int strongNumber(int n)
//	{
//		int sum=0;
//		int rem=0;
//		while(n>0)
//		{
//			rem=n%10;
//			sum=sum+findfactorial(rem);
//			n=n/10;
//		}
//		return sum;
//	}
//	
//	public int findfactorial(int n)
//	{
//		int fact = 1;
//		for(int i=n;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		return fact;
//	}

}

package PrimeNumber;

public class Prime 
{
	public int isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}

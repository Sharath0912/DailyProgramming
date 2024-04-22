package PrimeNumberInARange;

public class isPrime 
{
	public int isPrimee(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==2)
			return n;
		else
			return 0;
	}
}

package PerfectNumberInRange;

public class isPerfect 
{
	public boolean isPerfectNumber(int n)
	{
		int m=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==m)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
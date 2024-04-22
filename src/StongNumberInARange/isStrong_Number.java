package StongNumberInARange;

public class isStrong_Number 
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
}

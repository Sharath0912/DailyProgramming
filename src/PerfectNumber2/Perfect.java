package PerfectNumber2;

public class Perfect 
{
	public void isperfect(int n, int m)
	{
		int sum,h;
		
		for(int i=n;i<=m;i++)
		{
			sum=0;
			h=i;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}	
			}
			if(sum==h)
			{
				System.out.print(i+" ");
			}
		}
	}
}

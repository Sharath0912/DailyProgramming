package PerfectNumber2;

public class PerfectNumber {
	public static void main(String[] args) 
	{
		int sum,h;
		for(int i=1;i<=100;i++)
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

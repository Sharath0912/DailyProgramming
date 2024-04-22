package ReverseNumber;

public class Reverse 
{
	public int isReverse(int n)
	{
		int sum=0,rem;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum*10 + rem;
			n=n/10;
		}
		return sum;
	}
}

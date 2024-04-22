package ArmstrongNumber;

public class Armstrong 
{
	public int isArmstrong(int n)
	{
		int sum=0,p,rem=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		return sum;
	}
}

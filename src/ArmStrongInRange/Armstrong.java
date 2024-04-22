package ArmStrongInRange;

public class Armstrong 
{
	public boolean isArmstrong(int n)
	{
		int sum=0,rem=0,temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}
}

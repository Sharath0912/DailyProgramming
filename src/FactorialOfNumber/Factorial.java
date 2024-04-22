package FactorialOfNumber;

//Using Recurssion
public class Factorial 
{
	public int fact(int n)
	{
		int res;
		if(n==0)
		{
			res=1;
		}
		else
		{
			res=n*fact(n-1);
		}
		return res;
	}
}

package NestedWhileLoop;

public class PrintNumbers 
{
	public static void main(String[] args) 
	{
		int x=0,y=0;
		
		while(++x <= 5)
		{
			while(++y <= 5)
			{
				System.out.println(y);
			}
			System.out.println(y);
		}
	}
}

package PatternProblems;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		
		int n= 5;
		int k= 1;
		for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 System.out.printf("%2d ",k);
				 k+=2;
			 }
			 System.out.println();
		 }
	}
}

package WeekDays;

import java.util.Scanner;

public class WeekDays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satursday"};
		
		System.out.println("Enter the Day, operator, number :");
		String day = sc.nextLine();
		char c = sc.next().charAt(0);
		int n = sc.nextInt();
		int res = findIndex(str, day);
		
		findDay(str, res, c, n);
		
		
	}
		
		public static int findIndex(String[] array, String searchString) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals(searchString)) {
	                return i;
	            }
	        }
	        return -1; 
	    }
		
		public static void findDay(String[] array, int res,char c,int n)
		{
			int r=0;
			switch(c)
			{
				case '+':  System.out.println(array[res+n]);
						return;
						
				case '-' : 
					r=res-n;
					if(r<0)
					{
						r+=array.length;
					}
					System.out.println(array[r]);
					return;
			}
		}
}

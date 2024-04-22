package WeekDays;

import java.util.Scanner;

public class WeekDaysDisplay 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satursday"};
		
		System.out.println("Enter the Day, number :");
		String day = sc.nextLine();
		int n =sc.nextInt();
		int res = findIndex(str, day);
		
		findDay(str, res, n);
		
		
	}
		
		public static int findIndex(String[] array, String searchString) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals(searchString)) {
	                return i;
	            }
	        }
	        return -1; 
	    }
		
		public static void findDay(String[] array, int res,int n)
		{
			int r=0;
			r=res-n;
			if(r<0)
			{
				r+=array.length;
				System.out.println(array[r]);
				return;
			}
			else {
				System.out.println(array[res+n]);
			}
		}
}

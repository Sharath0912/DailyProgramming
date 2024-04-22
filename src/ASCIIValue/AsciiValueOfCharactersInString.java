package ASCIIValue;

import java.util.Scanner;

public class AsciiValueOfCharactersInString 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("The Given String: "+s);
		System.out.println("The ASCII Value of each Character in the String :");
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			System.out.println(s.charAt(i)+ " --> "+(int)c);
		}
	}
}

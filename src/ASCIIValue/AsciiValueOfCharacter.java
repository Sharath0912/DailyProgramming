package ASCIIValue;

import java.util.Scanner;

public class AsciiValueOfCharacter 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		int n = (int)c;
		System.out.println(n);
	}
}

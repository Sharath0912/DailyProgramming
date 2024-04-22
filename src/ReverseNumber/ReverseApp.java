package ReverseNumber;

import java.util.Scanner;

public class ReverseApp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Reverse reverse = new Reverse();
		
		System.out.println(reverse.isReverse(sc.nextInt()));
	}
}

package Swapping;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		
		int biggest = a>b && a>c ? a : b>c ? b : c ;
		System.out.println("Biggest among 3 is "+biggest);
	}

}

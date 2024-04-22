package AnagramUsingMethods;
import java.util.Scanner;

public class AnagramAPp 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		Anagram anagram=new Anagram();
		boolean res=anagram.isAnagram(arr1, arr2);
		
		if(res=true)
			System.out.println("Anagram");
		else
			System.out.println("Not a anagram");
	}
}

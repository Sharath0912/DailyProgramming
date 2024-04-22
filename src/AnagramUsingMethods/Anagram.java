package AnagramUsingMethods;
import java.util.Arrays;

public class Anagram 
{
	public boolean isAnagram(char arr1[], char arr2[])
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean res=Arrays.equals(arr1, arr2);
		return res;
	}
}

package Arrays1;

import java.util.Scanner;

public class InsertArrayIntoAnother 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println("Enter the position from where arr2 should be inserted into arr1"); 
        int pos = sc.nextInt();

        // Create a new array to hold the result
        int[] res = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to result before the insertion position
        for (int i = 0; i < pos; i++) {
            res[i] = arr1[i];
        }

        // Insert elements from arr2 into result at the insertion position
        for (int i = 0; i < arr2.length; i++) {
            res[pos + i] = arr2[i];
        }

        // Copy remaining elements from arr1 to result after the insertion
        for (int i = pos; i < arr1.length; i++) {
            res[arr2.length + i] = arr1[i];
        }

        System.out.println("Resulting array after inserting arr2 into arr1:");
        for (int n : res) {
            System.out.print(n + " ");
        }
    }
}


package Arrays1;

import java.util.Scanner;

public class InsertElementToArray 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        
        //print Before array
        System.out.println("Array Before Insertion: ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Enter the element and pos the ele to be inserted");
        int ele = sc.nextInt(); 
        int pos = sc.nextInt(); 

        //To Ensure position is within the array bounds
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid pos to insert.");
            return;
        }

        // Create a new array 
        int[] newArr = new int[arr.length + 1];

        // Copy elements up to the position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the element
        newArr[pos] = ele;

        // Copy the remaining elements
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        
        //print after insertion
        System.out.println("Array After Insertion : ");
        for(int i=0;i<newArr.length;i++)
        {
        	System.out.print(newArr[i]+" ");
        }

    }
}


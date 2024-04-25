package Arrays1;

public class InsertArrayIntoAnother 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        // Define the position where arr2 will be inserted into arr1
        int position = 2;

        // Create a new array to hold the result
        int[] result = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to result before the insertion position
        for (int i = 0; i < position; i++) {
            result[i] = arr1[i];
        }

        // Insert elements from arr2 into result at the insertion position
        for (int i = 0; i < arr2.length; i++) {
            result[position + i] = arr2[i];
        }

        // Copy remaining elements from arr1 to result after the insertion
        for (int i = position; i < arr1.length; i++) {
            result[arr2.length + i] = arr1[i];
        }

        System.out.println("Resulting array after inserting arr2 into arr1:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


package WeekDays;

import java.util.Scanner;

public class WeekDays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Enter the Day, operator, number :");
        String day = sc.nextLine();
        char operator = sc.next().charAt(0);
        int number = sc.nextInt();

        int index = findIndex(str, day);

        if (index != -1) {
            findDay(str, index, operator, number);
        } else {
            System.out.println("Invalid day input.");
        }
    }

    public static int findIndex(String[] array, String searchString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchString)) {
                return i;
            }
        }
        return -1;
    }

    public static void findDay(String[] array, int index, char operator, int number) {
        int resultIndex;
        switch (operator) {
            case '+':
                resultIndex = (index + number) % array.length; // Ensure index stays within bounds
                System.out.println(array[resultIndex]);
                break;
            case '-':
                resultIndex = (index - number) % array.length; // Ensure index stays within bounds
                if (resultIndex < 0) {
                    resultIndex += array.length; // Ensure positive index if it goes negative
                }
                System.out.println(array[resultIndex]);
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}


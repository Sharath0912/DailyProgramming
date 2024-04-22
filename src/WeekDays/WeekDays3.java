package WeekDays;

import java.util.Scanner;

public class WeekDays3 {
    public static void main(String[] args) {
        String[] weekdays = {"monday", "tuesday", "wednesday", "thurs", "fri", "sat", "sun"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        String dayInput = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive matching
        System.out.print("Enter num: ");
        int dayIncre = scanner.nextInt();

        String result = findIncre(weekdays, dayInput, dayIncre);
        System.out.println(result);
    }

    public static String findIncre(String[] days, String day, int num) {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                int userIndex = i;
                // Calculate the new index after the increment
                int userDay = userIndex + num;
                return days[userDay];
            }
        }
        return "Invalid day";
    }
}

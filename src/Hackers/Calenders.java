package Hackers;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calenders {
    private static String findDay(int month, int day, int year) {
        // Subtract 1 from the month since Calendar months are zero-based
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        String result = findDay(month, day, year);
        System.out.println(result);
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}


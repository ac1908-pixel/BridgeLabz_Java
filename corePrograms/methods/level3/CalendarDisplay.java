package corePrograms.methods.level3;

import java.util.Scanner;

/*
 Program to display calendar for a given month and year
 using Gregorian calendar algorithm
*/
class CalendarDisplay {

    // method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // method to get days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    }

    // method to get first day of month (0=Sun)
    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // loop for indentation
        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        // loop to print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}


/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

import java.util.Scanner;

public class FindTheNameOfDay {
    public static double calculateYearDays(double day, int year) {

        for (int i = 1; i < year; i++) {

            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                day += 366;
            } else {
                day += 365;
            }
        }
        return day;

    }

    public static double sumOfMonthsDays(int year, int month, double day) {

        int day30 = 30;
        int day31 = 31;
        int day28 = 28;

            for (int i = 1; i < month; i++) {
                if (i % 2 != 0 || i == 8) {
                    day += day31;
                } else if (i % 2 == 0 && i != 8 && i != 2) {
                    day += day30;

                } else if (i == 2) {

                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day += (day28 + 1);
                    } else {
                        day += (day28);
                    }
                }

            }
   
        return day;
    }

    public static String FindNameOfDay(double day) {
        int newDay = (int) (day) % 7;
        String dayName = "";
        switch (newDay) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Sunday";
                break;
        }
        return dayName;
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a day number: ");
        double day = scanner.nextInt();
        System.out.print("enter a month number: ");
        int month = scanner.nextInt();
        System.out.print("enter a year number:");
        int year = scanner.nextInt();
        scanner.close();
      
        day = calculateYearDays(day, year);
        day = sumOfMonthsDays(year, month, day);

        System.out.println(FindNameOfDay(day));
    }
}

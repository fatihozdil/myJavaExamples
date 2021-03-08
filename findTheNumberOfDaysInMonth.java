/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

import java.util.Scanner;

public class findTheNumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a month number:");
        int month = scanner.nextInt();
        System.out.print("enter a year:");
        int year = scanner.nextInt();
        scanner.close();
        int daysInmonth = 0;
        String nameOfMonth = "";
        switch (month) {
            case 1:
                nameOfMonth = "january";
                daysInmonth = 31;
                break;
            case 2:
                nameOfMonth = "February";
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    daysInmonth = 29;
                }
                daysInmonth = 28;
                break;
            case 3:
                nameOfMonth = "March";
                daysInmonth = 31;
                break;
            case 4:
                nameOfMonth = "April";
                daysInmonth = 30;
                break;
            case 5:
                nameOfMonth = "May";
                daysInmonth = 31;
                break;
            case 6:
                nameOfMonth = "June";
                daysInmonth = 30;
                break;
            case 7:
                nameOfMonth = "July";
                daysInmonth = 31;
                break;
            case 8:
                nameOfMonth = "August";
                daysInmonth = 31;
                break;
            case 9:
                nameOfMonth = "September";
                daysInmonth = 30;
                break;
            case 10:
                nameOfMonth = "October";
                daysInmonth = 31;
                break;
            case 11:
                nameOfMonth = "November";
                daysInmonth = 30;
                break;
            case 12:
                nameOfMonth = "December";
                daysInmonth = 31;
                break;
            default:
                System.out.println("wrong month");
                break;
        }
        System.out.println(nameOfMonth + " " + year + " has " + daysInmonth
        + " days");
    }
}

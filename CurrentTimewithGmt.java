/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

import java.util.Scanner;

public class CurrentTimewithGmt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long gmt = scanner.nextInt();
    scanner.close();
    long miliseconds = System.currentTimeMillis();

    long seconds = miliseconds / 1000;
    long currentSeconds = seconds % 60;

    long minutes = seconds / 60;
    long currentMinutes = minutes % 60;
    long hours = minutes / 60;
    long currentHours = (hours+gmt) % 24;
    System.out.println("current time is "+ currentHours + ":" 
    + currentMinutes + ":" + currentSeconds );

  }
}

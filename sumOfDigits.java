/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("enter integer:");
            int number = scanner.nextInt();
            if (number > 0 && number < 1000) {
                int sum = 0;
                while (true) {
                    sum += number % 10;
                    number /= 10;
                    if (number < 1) {
                        System.out.println(sum);
                        System.exit(0);
                        break;
                    }

                }
                break;

            }
           

        }
        scanner.close();
    }

}

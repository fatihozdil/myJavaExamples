package algorithmExamples;
/*
 * @author Muhammed Fatih ÖZDİL
 * @since Wed Mar 03 2021
 *
 */

import java.util.Scanner;

public class TrimWhiteSpaces {
    public static String Trim(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
           
            String b = String.valueOf(a);
            if (b.equals(" ")) {
                if (i + 1 != str.length()) {
                    char c = str.charAt(i + 1);
                    newString += String.valueOf(c).toUpperCase();
                    i++;

                }

            } else {
               
                newString += b;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your password");
        String password = scanner.nextLine();
        scanner.close();
        System.out.println(Trim(password));
    }
}

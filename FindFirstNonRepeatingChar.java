package algorithmExamples;
/*
 * @author Muhammed Fatih ÖZDİL
 * @since Wed Mar 03 2021
 *
 */

import java.util.Scanner;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a string: ");
        String string = scanner.nextLine();
        scanner.close();
        char[] array = new char[string.length()];
      
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    check = true;
                }
            }
            if (!check) {
                System.out.println("the firstnonRepeating letter is :" 
                + array[i]);
                break;
            }
        }
    }
}

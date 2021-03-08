/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

import java.util.Scanner;

public class PatternLikeRightAngleTriangleWithANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}

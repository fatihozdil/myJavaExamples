/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class PyramidWithANumber {
    public static void main(String[] args) {
        int num = 9;
        for (int i = 1; i <= num; i++) {
            for (int j2 = 0; j2 <= num - i; j2++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                if (j + 1 == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }
    }
}

/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
/* 
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1   
*/
package algorithmExamples;

public class PascalTriangle {
    public static void main(String[] args) {
        int num = 5;
        int count = 1;
        int c = 1;
        while (count <= num) {
            for (int j = 0; j < num - count; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < count; i++) {
                if (i == 0)
                    c = 1;
                else
                    c = c*(count - i) / i;
                System.out.print(" " + c);

            }
            System.out.println();
            count++;
        }
    }
}

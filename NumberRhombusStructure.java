/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
/* 
            1
          2 1 2
        3 2 1 2 3
*/
package algorithmExamples;

public class NumberRhombusStructure {
    public static void main(String[] args) {
        int num = 7;
        int count = 1;
        int k = 1;
        int c = 1;
        while (k <= num) {
            for (int i = 0; i < num - count + 10; i++) {
                System.out.print(" ");
            }
            int i = 0;
         
            while (i < count) {
                if (k-i <= 0) 
                    c++;
               else 
                    c = k-i;
                i++;
                System.out.print(" " + c);
            }
            System.out.println();
            k++;
            count += 2;
        }
    }
}

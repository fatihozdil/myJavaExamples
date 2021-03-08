/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class InvertedStarTriangle {
    public static void main(String[] args) {
        int num = 10;
        int count = num;
        while(count >= 1){
            for (int i = 0; i < num-count+11; i++) {
                System.out.print(" ");
            }
            for (int i = count; i > 0; i--) {
             
                    System.out.print("*");

            }
            count--;
            System.out.println();
        }
    }
}

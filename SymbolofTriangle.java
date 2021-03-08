/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class SymbolofTriangle {
    public static void main(String[] args) {
        int num = 6;
        int count = 1;
        while(count <= num){
            for (int i = 0; i < num-count; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < count; i++) {
                System.out.print("@");
            }
            count++;
            System.out.println();
        }
    }
}

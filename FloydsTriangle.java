/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class FloydsTriangle {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int count = 1;
        while (count <= num) {
            for (int j = 0; j < count; j++) {
                if (j + 1 == count) {
                    System.out.print(i);
                    i++;
                } else {
                    System.out.print(i + " ");
                    i++;
                }
            }
            System.out.println();
            count++;
        }
    }
}

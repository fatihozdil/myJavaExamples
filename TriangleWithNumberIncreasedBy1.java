/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class TriangleWithNumberIncreasedBy1 {
    public static void main(String[] args) {
        int num = 10;
        int count=1;
        int i = 1;
        while ( i < num ) {
  
            for (int j = 0; j < count; j++) {
                if(j + 1 == count){
                    System.out.print(i);
                    i++;
                } else{
                    System.out.print(i + " ");
                    i++;

                }
            
            }
            count++;
            System.out.println();
        }
    }
}

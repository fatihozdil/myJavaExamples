/*
 @author Muhammed Fatih ÖZDİL
 @since 03/03/2021

*/
package algorithmExamples;

public class Diamond {
    public static void main(String[] args) {
        int num = 7;
        int count=1;
        int k= 1;
        while(k<=num){
            for (int i = 0; i < num-k; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
             
            }
         
          k++;
            System.out.println();
            count+=2;
        }
        k-=2;
        count-=4;
        while(k>=1){
            for (int i = 0; i < num-k; i++) {
                System.out.print(" ");
            }
      
            for (int j = count; j > 0 ; j--) {
                System.out.print("*");
             
            }
          k--;
            System.out.println();
            count-=2;
        }
    }
}

/*
 @author Muhammed Fatih ÖZDİL
 @since 08/03/2021

*/
package algorithmExamples;

public class ReverseAStringUsingRecursion {
   public static void Reverse(String str) {
    if(str == null || str.length()<=1)
        System.out.print(str);
    else{
        System.out.print(str.charAt(str.length()-1));
        Reverse(str.substring(0,str.length()-1 ));
    }
    }
   public static void main(String[] args) {
       String str = "The quick brown fox jumps";
       Reverse(str);
   }
}

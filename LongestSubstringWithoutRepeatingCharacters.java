/*
 @author Muhammed Fatih ÖZDİL
 @since 07/03/2021

*/
package algorithmExamples;

public class LongestSubstringWithoutRepeatingCharacters {
public static boolean check(String str) {
    for (int i = 0; i < str.length(); i++) {
        for (int j = i+1; j < str.length(); j++) {
            if(str.charAt(i)== str.charAt(j)){
            return false;
            } 
        }
    }
    return true;
}
    public static void findLongest(String str) {
        boolean check = check(str);
        if(check){
           
          System.out.println(str);
        } 
        String[] arr = new String[str.length()];  
        for (int i = 0; i < str.length(); i++) {
           for (int j = 1; j < str.length(); j++) {
             check =     check(str.substring(i, str.length()-j));
             if(check){
      
           arr[i] = str.substring(i, str.length()-j);
        
                break;
              } 
           } 
        }
        for (int k = 0; k < arr.length; k++) {
            for (int k2 = 1; k2 < arr.length; k2++) {
              if (arr[k] != null && arr[k2] != null){
                if (arr[k].length() > arr[k2].length())
                    arr[k2] = arr[k]; 
                else 
                    arr[k] = arr[k2];
        }
              }
        }
        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        
            findLongest(str);
    }
}

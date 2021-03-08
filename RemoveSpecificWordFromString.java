/*
 @author Muhammed Fatih ÖZDİL
 @since 08/03/2021

*/
package algorithmExamples;

public class RemoveSpecificWordFromString {
    public static void remove(String str,String a ,String b) {
        char[] arr = str.toCharArray();
        char[] arr1 = b.toCharArray();
        String newStr = "";
        int L = arr.length;
        for (int i = 0; i < L; i++) {
            if(String.valueOf(arr[i]).equals(a))
                continue;
            else if (i+1<L && arr[i] == arr1[0] && arr[i+1] == arr1[1])
                continue;   
            else
                newStr += arr[i];
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "abrambabasc";
        remove(str,"b","ac");
    }
}

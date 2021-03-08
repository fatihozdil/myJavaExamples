/*
 @author Muhammed Fatih ÖZDİL
 @since 07/03/2021

*/
package algorithmExamples;

public class ReverseEveryWord {
    public static int countWhiteSpace(String str) {
        int countWhiteSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" "))
                countWhiteSpace++;
        }
        return countWhiteSpace;
    }

    public static String createArray(String str) {
        String[] arr = new String[countWhiteSpace(str) + 1];
        for (int i = 0; i < arr.length; i++)
            arr[i] = "";

        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" "))
                k++;
            else
                arr[k] += String.valueOf(str.charAt(i));
        }

        return toString(reverseArr(arr));
    }

    public static String[] reverseArr(String[] arr) {
        String[] tempArr = new String[arr.length];
        for (int i = 0; i < tempArr.length; i++)
            tempArr[i] = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {

                tempArr[i] += String.valueOf(arr[i].charAt(arr[i].length() - j - 1));

            }
        }
        return tempArr;
    }

    public static String toString(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                str += arr[i];
            else
                str += " " + arr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "This is a test string";
        System.out.println(createArray(str));
    }
}

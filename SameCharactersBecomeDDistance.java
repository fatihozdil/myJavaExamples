/*
 @author Muhammed Fatih ÖZDİL
 @since 07/03/2021

*/
package algorithmExamples;

public class SameCharactersBecomeDDistance {
    public static boolean ifExist(char[] arr, char[] newArr, int i) {

        for (int j2 = 0; j2 < newArr.length; j2++) {
            if (arr[i] == newArr[j2])
                return true;
        }
        return false;
    }

    public static char[] remainValues(char[] newArr, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (newArr[i] == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (!ifExist(arr, newArr, j))
                        newArr[i] = arr[j];
                }
            }

        }
        return newArr;
    }

    public static String convertString(char[] newArr) {
        StringBuilder str  = new StringBuilder(); 
       // String newStr = "";
        for (int i = 0; i < newArr.length; i++){
             str.append(newArr[i]);
  //  newStr += String.valueOf(newArr[i]);
}

        return str.toString();
    }

    public static String Distance(String str) {
        char[] arr = convertArr(str);
        char[] newArr = new char[arr.length];

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            int count = 1;
            if (ifExist(arr, newArr, i))
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    newArr[k] = arr[i];
                    newArr[k + 4 * count] = arr[j];
                    check = true;
                    count++;
                }

            }
            if (check)
                k++;
        }
       
        return convertString(remainValues(newArr, arr));
    }

    public static char[] convertArr(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

  
    public static void main(String[] args) {
        String str = "accessories";
        System.out.println(Distance(str));
    }


}

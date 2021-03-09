/*
 @author Muhammed Fatih ÖZDİL
 @since 08/03/2021

*/
package algorithmExamples;

public class FindSmallestWindow {
    public static String findWindow(String pat, String txt) {

        int[] hash_txt = new int[256];
        int[] hash_pat = new int[256];

        for (int i = 0; i < pat.length(); i++)
            hash_pat[pat.charAt(i)]++;

        int min = Integer.MAX_VALUE;
        int start = 0;
        int front = -1;
      
        int count = 0;
        for (int j = 0; j < txt.length(); j++) {
            hash_txt[txt.charAt(j)]++;
            if ( hash_txt[txt.charAt(j)] <= hash_pat[txt.charAt(j)]) {
                count++;
            }
            if (count == pat.length()) {
                while (hash_pat[txt.charAt(start)] == 0 || hash_pat[txt.charAt(start)] < hash_txt[txt.charAt(start)]) {
                    if (hash_pat[txt.charAt(start)] < hash_txt[txt.charAt(start)]) {
                        hash_txt[txt.charAt(start)]--;

                    }
                    start++;
                }
                int len = j - start + 1;
                if (min > len) {
                    min = len;
                    front = start;

                }
            }
        }
        if (front == -1) {
            System.out.println("No such window exists");
            return "";
        }
        return txt.substring(front, front + min);
    }

    public static void main(String[] args) {
        String txt = "welcome to w3resource";
        String pat = "tower";
        String test = findWindow(pat, txt);
        System.out.println(test);
    }
}

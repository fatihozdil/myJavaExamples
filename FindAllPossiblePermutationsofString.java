package algorithmExamples;

/*
 * @author Muhammed Fatih ÖZDİL
 * @since Wed Mar 03 2021
 *
 */

public class FindAllPossiblePermutationsofString {
    private static void swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
 
    private static void permutations(char[] ch, int currentIndex)
    {
        if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }
 
        for (int i = currentIndex; i < ch.length; i++)
        {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
 
    public static void main(String[] args)
    {
        String s = "ABCd";
        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] =  s.charAt(i);
        }
        permutations(ch, 0);
    }
}

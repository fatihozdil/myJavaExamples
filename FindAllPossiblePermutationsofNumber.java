/*
 @author Muhammed Fatih ÖZDİL
 @since 06/03/2021

*/
package algorithmExamples;

public class FindAllPossiblePermutationsofNumber {
    public static void swap(int[] arr, int initial, int i) {
        int temp = arr[initial];
        arr[initial] = arr[i];
        arr[i] = temp;

    }
 
    public static void permutation(int[] arr, int initial) {
        if (initial == arr.length - 1) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        }
        for (int i = initial; i < arr.length; i++) {
            swap(arr, initial, i);
            permutation(arr, initial + 1);
            swap(arr, initial, i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
     permutation(nums1, 0);
    }
}

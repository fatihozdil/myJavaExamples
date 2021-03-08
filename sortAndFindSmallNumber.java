package algorithmExamples;

/*
 * @author Muhammed Fatih ÖZDİL
 * @since Wed Mar 03 2021
 *
 */


public class sortAndFindSmallNumber {
    
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;

               }
           } 
        }
        return arr;
    }
    public static int minelement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean check = false ;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    check = true;
                    break;
                }

            }
            if(!check){
                return arr[i];
            }
        }  
        return -1;      
    }
    public static void main(String[] args) {
        
        int[] arr = {6,4,5,3,7,19,2};
        int [] newArr = sort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        System.out.println("smaller number is :" + minelement(arr));
        
        
    }
}

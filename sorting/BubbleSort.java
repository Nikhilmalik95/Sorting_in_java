
/**
 * Bubble Sort
 */
public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr  = {3 , 5, 7, 5, 2, 1};

        int[] ans = bubbleSort(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
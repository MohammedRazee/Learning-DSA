package InsertionSort;

import java.util.Arrays;

public class GitGud {
    public static void main(String[] args) {
//        int[] arr = {3,5,4,1,2};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapper(int[] arr, int j, int j1) {
        int temp = arr[j];
        arr[j] = arr[j1];
        arr[j1] = temp;
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swapper(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
}

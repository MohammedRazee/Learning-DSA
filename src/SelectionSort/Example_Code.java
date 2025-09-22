package SelectionSort;

import java.util.Arrays;

public class Example_Code {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {3,5,4,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int max = 0;
            for(int j = 0; j < n-i; j++) {
                if(arr[j] > arr[max]) max = j;
            }
            if (max == (n-i-1)) break;
            int temp = arr[max];
            arr[max] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}

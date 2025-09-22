package BubbleSort;

import java.util.Arrays;

public class Code_Example {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sortBubble(int[ ]arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swapper(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void swapper(int[] arr, int j, int j1) {
        int temp = arr[j];
        arr[j] = arr[j1];
        arr[j1] = temp;
    }
}

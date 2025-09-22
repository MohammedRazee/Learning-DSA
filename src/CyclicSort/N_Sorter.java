package CyclicSort;

import java.util.Arrays;

public class N_Sorter {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2,0};
        cycSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cycSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i];
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                ++i;
            }
        }

    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}

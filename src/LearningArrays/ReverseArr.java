package LearningArrays;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {15, 1, 9, 1, 368, 15, 9554};

        ArrReverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void ArrReverse(int[] arr) {
        int x = (arr.length)-1;
        int i = 0;
        while (i < x) {
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
            --x;
            ++i;
        }
    }

}

package LearningArrays;

import java.util.Arrays;

public class ShuffleX1Y1 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int x = n, j = 0;

        for (int i = 0; i < (2*n); i += 2) {
            arr[i] = nums[j++];
            arr[i+1] = nums[x++];
        }

        return arr;
    }
}

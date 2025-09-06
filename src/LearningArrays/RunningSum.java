package LearningArrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0, x = 0;

        for (int i: nums) {
            sum += i;
            runningSum[x++] = sum;
        }

        return runningSum;
    }
}

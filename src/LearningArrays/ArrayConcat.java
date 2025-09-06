package LearningArrays;

import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        int x = n;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[x] = nums[i];
            ++x;
        }

        return ans;
    }
}

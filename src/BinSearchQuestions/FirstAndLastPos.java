package BinSearchQuestions;

import java.util.Arrays;

class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findIndex(nums, target, true);
        ans[1] = findIndex(nums, target, false);

        return ans;
    }

    static int findIndex(int[] nums, int target, boolean FirstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
            else {
                ans = mid;
                if (FirstIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}

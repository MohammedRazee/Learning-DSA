package BinSearchQuestions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(getAns(arr, target));
    }

    static int getAns(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(target > nums[end]) {
            start = end + 1;
            end = start * 2;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;

            else {
                return mid;
            }
        }
        return -1;
    }
}

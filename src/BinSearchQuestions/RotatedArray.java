package BinSearchQuestions;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(arr, target));
    }
    public static int search(int[] nums, int target) {
        // Pivot method
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binSearch(nums, target, 0, nums.length-1);
        }

        if (nums[pivot] == target) return pivot;

        if (target < nums[0]) {
            return binSearch(nums, target, pivot+1, nums.length-1);
        }
        else {
            return binSearch(nums, target, 0, pivot-1);
        }
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if(mid < end && nums[mid] > nums[mid+1]) {
                System.out.println("what");
                return mid;
            }
            else if (mid > start && nums[mid] < nums[mid-1]) {
                System.out.println("tf");
                return mid-1;
            }
            else if(nums[mid] <= nums[start]) {
                System.out.println("worked");
                end = mid - 1;
            }
            else {
                System.out.println("or didint");
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binSearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}

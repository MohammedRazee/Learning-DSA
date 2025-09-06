package BinSearchQuestions;

public class MountainPeak {
    public static void main(String[] args) {
        int[] arr = {0,7,8,9,10,5,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {    // Checking if we are on the right side of the mountain`
                end = mid;
            }
            else {
                start = mid + 1;    // We are on the left side of the mountain so just move up
            }
        }
        return start;
    }
}

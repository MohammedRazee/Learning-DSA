package BinSearchQuestions;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int pivot = pivot(arr);

        System.out.println(pivot + 1);
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            else if (arr[mid] < arr[0]) end = mid - 1;
            else if (arr[mid] > arr[0]) start = mid + 1;
        }
        return -1;
    }
}

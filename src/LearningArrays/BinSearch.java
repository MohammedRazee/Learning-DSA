package LearningArrays;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {-15, -12, -82, 3, 651, 951, 984, 2130};

        System.out.println(binarysearch(arr, 951));

    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1 ;
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end)  {
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // This is better

            if (target > arr[mid]) start = (isAsc)? mid + 1 : mid - 1;
            else if (target < arr[mid]) end = (isAsc)? mid - 1 : mid + 1;
            else return mid;
        }

        return -1;
    }
}

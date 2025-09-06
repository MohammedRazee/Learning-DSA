package BinSearchQuestions;

public class Ceiling {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 14, 16, 20};
        int[] arr = {20, 16, 14, 4, 3, 2};

        System.out.println(CeilBinSearch(arr, 4));
        System.out.println(FloorBinSearch(arr, 20));

    }

    static int CeilBinSearch(int[] arr, int item) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (item < arr[mid]) {
                if (isAsc) end = mid - 1;
                else start = mid + 1;
            }
            else if (item > arr[mid]) {
                if (isAsc) start = mid + 1;
                else end = mid - 1;
            }
            else return arr[mid];
        }

        if (isAsc) return arr[start];
        return arr[end];
    }

    static int FloorBinSearch(int[] arr, int item) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (item < arr[mid]) {
                if (isAsc) end = mid - 1;
                else start = mid + 1;
            }
            else if (item > arr[mid]) {
                if (isAsc) start = mid + 1;
                else end = mid - 1;
            }
            else return arr[mid];
        }

        if (isAsc) return arr[end];
        return arr[start];
    }
}

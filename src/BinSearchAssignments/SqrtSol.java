package BinSearchAssignments;

public class SqrtSol {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
//        System.out.println(mySqrt(64));
    }

    static int binSearch(int start, int end, int x) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            long check = (long) mid * mid;

            if (check == x) return mid;
            else if(check > x) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = 1;

        long check = end;

        do {
            start = end;
            end = start * 2;

            check =(long)end * end;
        } while (check < x);

        return binSearch(start, end, x);
    }

}

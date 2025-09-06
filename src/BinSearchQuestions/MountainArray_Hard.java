package BinSearchQuestions;

public class MountainArray_Hard {
    /*
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = getPeak(target, mountainArr);

        int rstart = end + 1;
        int rend = mountainArr.length() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < target) start = mid + 1;
            else if (mountainArr.get(mid) > target) end = mid - 1;
            else return mid;
        }

        while (rstart <= rend) {
            int mid = rstart + (rend - rstart) / 2;
            if (mountainArr.get(mid) > target) rstart = mid + 1;
            else if (mountainArr.get(mid) < target) rend = mid - 1;
            else return mid;
        }
        return -1;
    }

    static int getPeak(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                if (mountainArr.get(mid) < mountainArr.get(mid-1)) {
                    end = mid - 1;
                }
                else return mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    */

}

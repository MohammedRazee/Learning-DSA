package LearningArrays;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image[0].length - 1;

        for (int[] row: image) {
            int left = 0;
            int right = m;
            while (left <= right) {
                int temp = row[left];
                row[left++] = row[right] ^ 1;
                row[right--] = temp ^ 1;
            }
        }

        return image;

    }
}

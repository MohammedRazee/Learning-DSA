package LearningArrays;

import java.util.Scanner;

public class Doing2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;
        int l = (n*n) -1;

        for (int i = 0; i < l; i++) {
            int row = i / n;
            int col = i % n;

            System.out.print(arr[row][col]);
        }
    }
}

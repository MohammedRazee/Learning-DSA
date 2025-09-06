package LearningArrays;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int item = 5;
        for (int i: arr) {
            if (item == i) {
                System.out.println("Item found in array");
                return;
            }
        }
        System.out.println("Item not found!");
    }
}

package LearningArrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {15, 15, 1, 9, 1, 368, 15, 9554};

        System.out.println(maxI(arr));
    }

    static int maxI(int[] arr) {
        int large = Integer.MIN_VALUE;
        for(int i: arr){
            large = Math.max(i, large);
        }
        return large;
    }
}

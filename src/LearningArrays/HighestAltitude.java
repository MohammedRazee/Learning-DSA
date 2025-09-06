package LearningArrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for (int i: gain) {
            sum += i;
            max = Math.max(sum, max);
        }

        return max;
    }
}

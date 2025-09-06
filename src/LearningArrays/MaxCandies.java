package LearningArrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(new List[]{kidsWithCandies(candies, extraCandies)}));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();

        for (int i: candies) {
            max = Math.max(i, max);
        }

        for (int i: candies) {
            result.add((i+extraCandies) >= max);
        }
        return result;
    }
}

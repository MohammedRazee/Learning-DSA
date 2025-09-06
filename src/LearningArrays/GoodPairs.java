package LearningArrays;

import java.util.Map;
import java.util.HashMap;


public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i: nums) {
            if (map.containsKey(i)) {
                count += map.get(i);
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        return count;
    }
}

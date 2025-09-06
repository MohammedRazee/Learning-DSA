package LearningArrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;

        int max = Integer.MIN_VALUE;

        for (int r = 0; r < n; r++) {
            int sum = 0;
            for (int c = 0; c < m; c++) {
                sum += accounts[r][c];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}

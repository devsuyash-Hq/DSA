class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int total = n * n;

        long expectedSum = (long) total * (total + 1) / 2;
        long expectedSquareSum = (long) total * (total + 1) * (2L * total + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                actualSum += num;
                actualSquareSum += (long) num * num;
            }
        }

        long diff = actualSum - expectedSum;
        long squareDiff = actualSquareSum - expectedSquareSum;

        long sum = squareDiff / diff;

        long repeating = (diff + sum) / 2;
        long missing = sum - repeating;

        return new int[] {
            (int) repeating,
            (int) missing
        };
    }
}
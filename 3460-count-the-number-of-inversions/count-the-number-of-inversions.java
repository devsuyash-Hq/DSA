class Solution {

    static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] requirements) {

        int[] req = new int[n];
        java.util.Arrays.fill(req, -1);

        for (int[] r : requirements) {
            req[r[0]] = r[1];
        }

        int maxInv = n * (n - 1) / 2;

        long[] dp = new long[maxInv + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {

            long[] next = new long[maxInv + 1];

            long window = 0;

            for (int inv = 0; inv <= maxInv; inv++) {

                window += dp[inv];

                if (inv - i - 1 >= 0) {
                    window -= dp[inv - i - 1];
                }

                window = (window + MOD) % MOD;

                next[inv] = window;
            }

            dp = next;

            if (req[i] != -1) {

                int required = req[i];

                for (int inv = 0; inv <= maxInv; inv++) {
                    if (inv != required) {
                        dp[inv] = 0;
                    }
                }
            }
        }

        return (int) dp[req[n - 1]];
    }
}
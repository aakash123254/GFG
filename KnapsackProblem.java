class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here

        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return knapSackUtil(W, wt, val, n - 1, dp);

    }

    static int knapSackUtil(int W, int[] wt, int[] val, int idx, int[][] dp){
        if(idx < 0){
            return 0;
        }

        if(dp[idx][W] != -1){
            return dp[idx][W];
        }

        int a = 0;
        if(W - wt[idx] >= 0){
            a = val[idx] + knapSackUtil(W - wt[idx], wt, val, idx - 1, dp);
        }

        int b = knapSackUtil(W, wt, val, idx - 1, dp);

        return dp[idx][W] = Math.max(a, b);

    }
}
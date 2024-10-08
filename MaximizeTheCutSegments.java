class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        maximizeCutsUtil(n, x,y,z,dp);
        return dp[n]==-1 ? 0:dp[n];
    }

    int maximizeCutsUtil(int n, int x, int y, int z, int[]dp){
        if(n==0){
            return 0;
        }

        if(n<0){
            return -1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int cutx = maximizeCutsUtil(n-x, x,y,z, dp);
        int cuty = maximizeCutsUtil(n-y, x,y,z, dp);
        int cutz = maximizeCutsUtil(n-z, x,y,z, dp);

        int max = Math.max(cutx, Math.max(cuty,cutz));
        if(max == -1){
            dp[n]=-1;
        }else{
            dp[n] = max + 1;
        }
        return dp[n];
    }
}
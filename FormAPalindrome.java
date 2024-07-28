class Solution{
    static int countMin(String str)
    {
        int n=str.length();
        int dp[][] = new int[n][n];

        for(int g=1;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                dp[i][j] = (str.charAt(i)==str.charAt(j)?
                        dp[i+1][j-1]:
                        Math.min(dp[i+1][j],dp[i][j-1])+1
                );
            }
        }
        return dp[0][n-1];
    }
}
class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        return longestCommonSubstr(str1,str2,str1.length(),str2.length());
    }
    int longestCommonSubstr(String s1, String s2, int n, int m){
        int dp[][] = new int[n+1][m+1];
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] =1+dp[i-1][j-1];
                    ans=Math.max(dp[i][j],ans);
                }
            }
        }
        return ans;
    }
}
class Solution {
    ArrayList<String> res=new ArrayList<>();
    public ArrayList<String> findPath(int[][] mat) {
        int n=mat.length;
        if(mat[0][0]== 0 || mat[n-1][n-1]==0){
            res.add("-1");
            return res;
        }

        boolean[][] vis = new boolean[n][n];
        String path="";
        dfs(mat,0,0,vis,n,path);
        return res;
    }
    void dfs(int[][]mat, int i,int j, boolean[][] vis, int n, String path){

        if(i<0 || j<0 || i>=n || j>=n){
            return;
        }

        if(mat[i][j] == 0 || vis[i][j] == true){
            return;
        }
        if(i==n-1 && j==n-1){
            res.add(path);
            return;
        }

        vis[i][j] = true;

        dfs(mat, i+1,j, vis,n, path+"D");
        dfs(mat, i-1,j, vis,n, path+"U");
        dfs(mat, i,j+1, vis,n, path+"R");
        dfs(mat, i,j-1, vis,n, path+"L");
        vis[i][j] = false;
    }
}
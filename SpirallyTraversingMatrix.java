class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n=matrix.length, m=matrix[0].length,top=0,left=0,right=m-1,bottom=n-1;

        while(top<=bottom && left<=right){
            //top row
            //left to right
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;

            if(top>bottom || left>right) break;

            //right column
            //top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top>bottom || left>right)    break;

            //bottom row
            //right to left
            for(int j=right;j>=left;j--){
                ans.add(matrix[bottom][j]);
            }
            bottom--;

            if(top>bottom || left>right)    break;

            //left column
            //bottom to top

            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}

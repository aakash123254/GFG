class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n=arr.length;
        int m=arr[0].length;
        int j=m-1;
        int maxRow=-1;
        for(int i=0;i<n;i++){
            while(j>=0 && arr[i][j] ==1){
                maxRow=i;
                j--;
            }
        }
        return maxRow;
    }
}
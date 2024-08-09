class Solution {

    int Maximize(int arr[]) {
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            long temp = (long)arr[i]*i;
            sum+=temp;
        }
        return (int)(sum%1000000007);
    }
}

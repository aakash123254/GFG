class Solution {
    long floorSqrt(long n) {
        long l=1, r=n/2, ans=1;

        while(l<=r){
            long mid = l+(r-l)/2;
            long val = mid*mid;

            if(val==n){
                return mid;
            }
            else if(val>n){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}

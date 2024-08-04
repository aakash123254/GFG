class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        int a[][] = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = start[i];
            a[i][1] = end[i];
        }
        Arrays.sort(a,(o1,o2)-> o1[1]-o2[1]);
        int ans=1, time=a[0][1];

        for(int i=1;i<n;i++){
            if(a[i][0]>time){
                ans++;
                time=a[i][1];
            }
        }
        return ans;
    }
}

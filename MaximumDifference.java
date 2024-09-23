class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ls = new int[n];
        ls[0] = 0;
        st.push(arr[0]);
        for(int i = 1; i < n; ++i){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }

            ls[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        st.clear();

        int[] rs = new int[n];
        rs[n - 1] = 0;
        st.push(arr[n - 1]);
        for(int i = n - 2; i >= 0 ; --i){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }

            rs[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        int diff = 0;
        for(int i = 0; i < n; ++i){
            diff = Math.max(diff, Math.abs(ls[i] - rs[i]));
        }
        return diff;

    }
}
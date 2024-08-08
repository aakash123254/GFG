class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int idx=0;
        for(int i=0;i<arr1.length;i++){
            mergedArr[idx] = arr1[i];
            idx++;
        }
        for(int i=0;i<arr2.length;i++){
            mergedArr[idx] = arr2[i];
            idx++;
        }
        Arrays.sort(mergedArr);
        return mergedArr[k-1];
    }
}
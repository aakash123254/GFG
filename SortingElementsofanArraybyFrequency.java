class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int ele : arr){
            res.add(ele);
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele) + 1);
            }
            else{
                map.put(ele, 1);
            }
        }

        Collections.sort(res,(a, b)->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA != freqB){
                return freqB - freqA;
            }
            else{
                return a - b;
            }
        });

        return res;

    }
}
class Solution {
    boolean kPangram(String str, int k) {
        int n=0;

        Set<Character> set = new HashSet<>(26);
        for(char c:str.toCharArray()){
            if(c==' ') continue;
            set.add(c);
            n++;
        }
        if(n<26) return false;

        int unique=set.size();

        int need=26-unique;
        return need<=k;
    }
}

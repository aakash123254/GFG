class Solution {
    String removeDups(String str) {
        Set <Character> set = new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c : str.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
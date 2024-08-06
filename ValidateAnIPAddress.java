class Solution {

    public boolean isValid(String str) {
        String a[] = str.split("\\.");
        if(a.length!=4) return false;

        for(String i:a){
            if(i.isEmpty()) return false;

            int val = Integer.parseInt(i);
            int real_len = String.valueOf(val).length();

            if(i.length()!=real_len || val<0 || val>255) return false;
        }
        return true;
    }
}
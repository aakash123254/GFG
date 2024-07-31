class Solution {
    public String longestCommonPrefix(String arr[]) {
        String str=arr[0];
        for(int i=1;i<arr.length;i++){
            str = common(str,arr[i]);
        }
        return str.length()==0? "-1":str;
    }
    String common(String a, String b){
        int n=a.length(),m=b.length(),i=0;

        for(;i<Math.min(n,m);i++){
            if(a.charAt(i)!=b.charAt(i)) return a.substring(0,i);
        }
        return a.substring(0,i);

    }
}
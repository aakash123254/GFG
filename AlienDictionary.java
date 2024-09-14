class Solution {
    public String findOrder(String[] dict, int n, int k) {

        Map<Character,List<Character>> map=new HashMap<>();
        for(String word:dict){
            for(char c:word.toCharArray()){
                map.put(c,new ArrayList<>());
            }
        }

        for(int i=1;i<n;i++){

            for(int j=0;j<Math.min( dict[i-1].length() , dict[i].length() );j++){
                if(dict[i-1].charAt(j)!=dict[i].charAt(j)){
                    map.get(dict[i-1].charAt(j)).add(dict[i].charAt(j));
                    break;
                }
            }

        }

        Set<Character> vis = new HashSet<>();
        Stack<Character> st = new Stack<>();

        for(Character l:map.keySet()){
            if(!vis.contains(l))    topologicalSort(map,st,vis,l);
        }

        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
    void topologicalSort(Map<Character,List<Character>> map, Stack<Character> st, Set<Character> vis,char c){
        vis.add(c);

        for(Character nbr:map.get(c)){
            if(!vis.contains(nbr))  topologicalSort(map,st,vis,nbr);
        }

        st.push(c);
    }
}
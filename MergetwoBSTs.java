class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> l1 = new ArrayList<>() , l2=new ArrayList<>();
        inOrder(root1,l1);
        inOrder(root2,l2);

        return mergeTwoList(l1,l2);
    }

    void inOrder(Node node, List<Integer> list){
        if(node==null) return;

        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);
    }

    List<Integer> mergeTwoList(List<Integer> l1, List<Integer>l2){
        List<Integer> ans=new ArrayList<>();

        int i=0, j=0, n=l1.size(), m=l2.size();

        while(i<n && j<m){
            if(l1.get(i) < l2.get(j)){
                ans.add(l1.get(i));
                i++;
            }else{
                ans.add(l2.get(j));
                j++;
            }
        }
        while(i<n){
            ans.add(l1.get(i++));
        }
        while(j<m){
            ans.add(l2.get(j++));
        }
        return ans;
    }
}
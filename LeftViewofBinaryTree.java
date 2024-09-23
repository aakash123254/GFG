class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        preOrder(root,ans,1);
        return ans;
    }
    void preOrder(Node root, ArrayList<Integer> ans, int lvl){
        if(root==null) return;
        if(ans.size()<lvl) ans.add(root.data);
        preOrder(root.left,ans,lvl+1);
        preOrder(root.right,ans,lvl+1);
    }
}
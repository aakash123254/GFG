class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {

        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        int hd=0;
        root.hd = hd;
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            map.put(curr.hd,curr.data);
            if(curr.left!=null){
                hd=curr.hd-1;
                curr.left.hd = hd;
                q.add(curr.left);
            }

            if(curr.right!=null){
                hd = curr.hd+1;
                curr.right.hd = hd;
                q.add(curr.right);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            res.add(entry.getValue());
        }

        return res;
    }
}
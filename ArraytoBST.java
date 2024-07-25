class Solution {
    public Node sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    Node build(int a[],int l,int r){
        if(l>r) return null;

        int mid = l+(r-l)/2;
        Node node = new Node(a[mid]);

        node.left = build(a,l,mid-1);
        node.right = build(a,mid+1,r);

        return node;
    }
}
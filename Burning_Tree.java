public static int maxDepth(Node node){
    if(node==null) return 0;
    return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
}

public static int traverse(Node node, int target){

    if(node==null) return 0;

    if(node.data==target){
        ans=Math.max(ans,maxDepth(node.right));
        ans=Math.max(ans,maxDepth(node.left));
        return 1;
    }

    int val = traverse(node.left,target);

    if(val!=0){
        ans = Math.max(ans,val+maxDepth(node.right));
        return val+1;
    }

    val = traverse(node.right,target);

    if(val!=0){
        ans = Math.max(ans,val+maxDepth(node.left));
        return val+1;
    }
    return 0;
}

static int ans;
public static int minTime(Node root, int target)
{
    ans = 0;
    traverse(root,target);
    return ans;
}
}
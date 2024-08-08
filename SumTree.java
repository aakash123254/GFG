class Solution {
    boolean isSum = true;
    boolean isSumTree(Node root) {
        isSumTreeUtil(root);
        return isSum;
    }
    int isSumTreeUtil(Node root){
        if(isSum == false){
            return 0;
        }

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return root.data;
        }

        int lData = isSumTreeUtil(root.left);
        int rData = isSumTreeUtil(root.right);

        if(root.data != lData + rData){
            isSum = false;
        }
        return root.data + lData + rData;
    }
}

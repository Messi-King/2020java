class Solution {
     public int maxDepth(TreeNode root) {
      if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if(leftHeight > rightHeight) {
            return leftHeight+1;
        }
        return rightHeight+1;
    }
    public boolean isBalanced(TreeNode root) {
    if(root == null) return true;
     if(maxDepth(root.left)-maxDepth(root.right)>1 || maxDepth(root.right)-maxDepth(root.left)>1){
         return false;
     }
      return isBalanced(root.left) && isBalanced(root.right);
    }
}

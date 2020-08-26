class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if(p == null || q == null) {
            return false;
        }else if (p.val != q.val) {
            return false;
        }else {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) {
            return false;
        }
        if(isSameTree(s,t)) return true;
        
        if(isSubtree(s.left,t)) return true;
        if(isSubtree(s.right,t)) return true;
        return false;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSame(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        if(root == null || subroot == null) return false;
        if(root.val != subroot.val) return false;
        
        return isSame(root.left,subroot.left) && isSame(root.right,subroot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(root.val == subRoot.val && isSame(root,subRoot)){
            
            return true;
        } else
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot); 
    }
}



class Solution {
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      height(root);
      return dia;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        
        dia = Math.max(dia , right+ left);
        return 1 + Math.max(right,left);
    }
}

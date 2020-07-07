/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class day67_solution extends TreeNode{
    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String arg[]){
        TreeNode root = new TreeNode(4);
        TreeNode rootRight = new TreeNode(7);
        TreeNode rootLeft = new TreeNode(2);
        rootRight.left = new TreeNode(6);
        rootRight.right = new TreeNode(9);
        rootLeft.left = new TreeNode(1);
        rootLeft.right = new TreeNode(3);


    }
}

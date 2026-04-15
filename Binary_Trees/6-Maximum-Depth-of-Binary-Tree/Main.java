class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        //code here
        if(root==null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

public class Main{
    public static void main(String[] args) {
        // Build a sample tree:
        //        1
        //       / \
        //      2   3
        //     /
        //    4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution sol = new Solution();
        int depth = sol.maxDepth(root);

        System.out.println("Maximum depth of the tree: " + depth);
    }
}
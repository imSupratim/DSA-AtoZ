import java.util.*;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution{
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = Math.max(0, dfs(root.left));
        int rightSum = Math.max(0, dfs(root.right));

        maxSum = Math.max(maxSum, (root.val + leftSum + rightSum));

        return root.val + Math.max(leftSum, rightSum);
    }

}

public class Main {
    public static void main(String[] args) {
        // Creating test tree
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(
            "Maximum Path Sum: " +
            sol.maxPathSum(root)
        );
    }
}
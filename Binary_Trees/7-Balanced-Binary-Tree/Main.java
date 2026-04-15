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

class Solution {
    static boolean isBalanced(TreeNode root) {
        if (check(root) == -1) {
            return false;
        }
        return true;

    }

    static int check(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = check(root.left);
        int rh = check(root.right);

        if (lh == -1 || rh == -1) {
            return -1;
        }

        if (Math.abs(lh - rh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1: Balanced tree
        TreeNode balancedRoot = new TreeNode(1);
        balancedRoot.left = new TreeNode(2);
        balancedRoot.right = new TreeNode(3);
        balancedRoot.left.left = new TreeNode(4);
        balancedRoot.left.right = new TreeNode(5);

        System.out.println("Balanced tree? " + Solution.isBalanced(balancedRoot)); 
        // Expected: true

        // Example 2: Unbalanced tree
        TreeNode unbalancedRoot = new TreeNode(1);
        unbalancedRoot.left = new TreeNode(2);
        unbalancedRoot.left.left = new TreeNode(3);
        unbalancedRoot.left.left.left = new TreeNode(4);

        System.out.println("Balanced tree? " + Solution.isBalanced(unbalancedRoot)); 
        // Expected: false
    }
}
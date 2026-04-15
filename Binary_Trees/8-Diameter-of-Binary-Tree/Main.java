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
    static int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int rootDiameter = leftDepth + rightDepth;

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));

    }


    static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh, rh) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        // Build a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Call the diameter function
        int diameter = Solution.diameterOfBinaryTree(root);

        // Print result
        System.out.println("Diameter of the tree: " + diameter);
    }
}
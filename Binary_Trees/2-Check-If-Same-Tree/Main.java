import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

            if(first == null && second == null){
                continue;
            }
            if(first == null || second == null || first.val != second.val){
                return false;
            }

            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Identical Trees
        // Tree 1: [1, 2, 3]
        // Tree 2: [1, 2, 3]
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Test Case 1 (Identical): " + sol.isSameTree(p1, q1)); // Expected: true

        // Test Case 2: Different Values
        // Tree 1: [1, 2]
        // Tree 2: [1, null, 2]
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Test Case 2 (Structure): " + sol.isSameTree(p2, q2)); // Expected: false

        // Test Case 3: Different Structure
        // Tree 1: [1, 2, 1]
        // Tree 2: [1, 1, 2]
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println("Test Case 3 (Values swapped): " + sol.isSameTree(p3, q3)); // Expected: false
        
        // Test Case 4: Both Empty
        System.out.println("Test Case 4 (Both Empty): " + sol.isSameTree(null, null)); // Expected: true
    }
}
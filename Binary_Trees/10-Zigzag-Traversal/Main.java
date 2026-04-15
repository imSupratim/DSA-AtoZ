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
     List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean flag = true;
        // true = left to right
        // false = right to left

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i = 0; i<n ;i++){
                TreeNode node = queue.poll();
                subList.add(node.val);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }

            if(flag){
                list.add(subList);
                flag = false;
            }
            else{
                Collections.reverse(subList);
                list.add(subList);
                flag = true;
            }
        }
        return list;

    }
}


public class Main {
    public static void main(String[] args) {
        // Create binary tree:
        //        1
        //      /   \
        //     2     3
        //    / \     \
        //   4   5     6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Create solution object
        Solution sol = new Solution();

        // Get zigzag traversal
        List<List<Integer>> ans = sol.zigzagLevelOrder(root);

        // Print result
        System.out.println(ans);
    }
}

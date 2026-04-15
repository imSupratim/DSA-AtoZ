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
    static List<Integer> Preorder(TreeNode root){
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if(root == null){
            return preorder;
        }

        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();

            preorder.add(root.val);

            if(root.right != null){
                st.push(root.right);
            }

            if(root.left!=null){
                st.push(root.left);
            }

        }

        return preorder;
    }
}

public class Main{
    public static void main(String[] args) {
        /*
                  1
                 / \
                2   3
               / \
              4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = Solution.Preorder(root);

        System.out.println("Preorder Traversal: " + result);
        // Expected Output: [1, 2, 4, 5, 3]
    }
}
package linkedlist;

public class BinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Optional: main method for local testing
    public static void main(String[] args) {
        BinaryTree sol = new BinaryTree();

        // Example 1: Balanced tree
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        System.out.println(sol.isBalanced(root1)); // true

        // Example 2: Unbalanced tree
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2)
        );
        System.out.println(sol.isBalanced(root2)); // false

        // Example 3: Empty tree
        TreeNode root3 = null;
        System.out.println(sol.isBalanced(root3)); // true
    }
}

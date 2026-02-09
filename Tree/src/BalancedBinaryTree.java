import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        /*
            Input BST (Unbalanced):
                    1
                     \
                      2
                       \
                        3
                         \
                          4
         */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode balancedRoot = sol.balanceBST(root);

        System.out.println("Inorder traversal of Balanced BST:");
        sol.printInorder(balancedRoot); // should be sorted and balanced
    }

    // 🔹 Main method required by LeetCode
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return buildBalancedBST(inorder, 0, inorder.size() - 1);
    }

    // Step 1: Inorder traversal to collect sorted values
    private void inorderTraversal(TreeNode root, List<Integer> inorder) {
        if (root == null) return;

        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }

    // Step 2: Convert sorted list into balanced BST
    private TreeNode buildBalancedBST(List<Integer> inorder, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));

        root.left = buildBalancedBST(inorder, left, mid - 1);
        root.right = buildBalancedBST(inorder, mid + 1, right);

        return root;
    }

    // Utility method to print inorder traversal
    private void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}

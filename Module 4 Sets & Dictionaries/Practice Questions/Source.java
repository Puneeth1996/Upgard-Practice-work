import java.util.Scanner;
import java.util.Arrays;

class Node {
    int value;
    Node leftchild, rightchild;

    Node(int item) {
        value = item;
        leftchild = rightchild = null;
    }
}

class BinaryTree {
    Node root;
    static int preIndex = 0;
    static int index = 0;

    Node constructTree(int in[], int pre[], int inStrt, int inEnd) {
        if (inStrt > inEnd)
            return null;

        Node tNode = new Node(pre[preIndex++]);

        if (inStrt == inEnd)
            return tNode;

        int inIndex = search(in, inStrt, inEnd, tNode.value);

        tNode.leftchild = constructTree(in, pre, inStrt, inIndex - 1);
        tNode.rightchild = constructTree(in, pre, inIndex + 1, inEnd);

        return tNode;
    }

    int search(int arr[], int strt, int end, int value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    int sumBinaryTree(Node node) {
        // Base case
        if (node == null)
            return 0;

        // Store the old value
        int old_val = node.value;

        // Recursively call for left and right subtrees and store the sum
        // as new value of this node
        node.value = sumBinaryTree(node.leftchild) + sumBinaryTree(node.rightchild);

        // Return the sum of values of nodes in left and right subtrees
        // and old_value of this node
        return node.value + old_val;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.leftchild);

        // then recur on right subtree
        printPostorder(node.rightchild);

        // now deal with the node
        System.out.print(node.value + " ");
    }

    void inOrder(Node node, int array[]) {
        if (node == null)
            return;
        inOrder(node.leftchild, array);
        array[index++] = node.value;
        inOrder(node.rightchild, array);

    }

    /* A helper function to count nodes in a Binary Tree */
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return countNodes(root.leftchild) + countNodes(root.rightchild) + 1;
    }

    /*
     * A helper function that stores inorder traversal of a tree rooted with node
     */
    static void storeInorder(Node node, int inorder[]) {
        // Base Case
        if (node == null)
            return;

        /* first store the left subtree */
        storeInorder(node.leftchild, inorder);

        /* Copy the root's data */
        inorder[index] = node.value;
        index++; // increase index for next entry

        /* finally store the right subtree */
        storeInorder(node.rightchild, inorder);
    }

    /*
     * A helper function that copies contents of arr[] to Binary Tree. This function
     * basically does Inorder traversal of Binary Tree and one by one copy arr[]
     * elements to Binary Tree nodes
     */
    void arrayToBST(int[] arr, Node root) {
        // Base Case
        if (root == null)
            return;

        /* first update the left subtree */
        arrayToBST(arr, root.leftchild);

        /* Now update root's data and increment index */
        root.value = arr[index];
        index++;

        /* finally update the right subtree */
        arrayToBST(arr, root.rightchild);
    }

    void binaryTreeToBST(Node root) {
        // base case: tree is empty
        if (root == null)
            return;

        /*
         * Count the number of nodes in Binary Tree so that we know the size of
         * temporary array to be created
         */
        int n = countNodes(root);

        // Create a temp array arr[] and store inorder traversal of tree in arr[]
        int arr[] = new int[n];

        storeInorder(root, arr);

        // Sort the array using library function for quick sort
        Arrays.sort(arr);

        // Copy array elements back to Binary Tree
        index = 0;
        arrayToBST(arr, root);
    }
}

class Source {

    // driver program to test above functions
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int in[] = new int[len];
        int pre[] = new int[len];
        for (int i = 0; i < len; i++) {
            in[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            pre[i] = scanner.nextInt();
        }
        BinaryTree tree = new BinaryTree();
        Node root = tree.constructTree(in, pre, 0, len - 1);
        tree.sumBinaryTree(root);
        int inSumTree[] = new int[len];
        tree.inOrder(root, inSumTree);
        Arrays.sort(inSumTree);
        Node bstRoot = tree.ArrayToBST(inSumTree, root);
        tree.printPostorder(bstRoot);

    }
}

package Java.Tree;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Method to insert a new value into the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method to insert a new value
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Method to search for a value in the BST
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // Recursive method to search for a value
    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }

    // Method for inorder traversal
    public void inorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    // Recursive method for inorder traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting nodes into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Printing the inorder traversal of the BST
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(); // Output: 20 30 40 50 60 70 80

        // Searching for values in the BST
        System.out.println("Search 40: " + bst.search(40)); // Output: true
        System.out.println("Search 90: " + bst.search(90)); // Output: false
    }
}

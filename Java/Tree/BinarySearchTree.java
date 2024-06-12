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
    int idx = -1;

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;

    }

    // public Node buildSearchTree(int root) {

    // }

    public static void main(String[] args) {
        int nodes[] = { 20, };
        // BinarySearchTree bt = BinarySearchTree();
    }

}

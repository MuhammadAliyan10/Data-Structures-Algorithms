package Java.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public T data() {
        return data;
    }

    public List<TreeNode<T>> children() {
        return children;
    }

    public void printTree(String prefix) {
        System.out.println(prefix + data);
        for (TreeNode<T> child : children) {
            child.printTree(prefix + "   ");
        }
    }
}

public class Tree<T> {
    TreeNode<T> root;

    public Tree(T rootData) {
        root = new TreeNode<>(rootData);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void printTree() {
        if (root != null) {
            root.printTree("");
        }
    }

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("Parent");
        TreeNode<String> root = tree.getRoot();
        TreeNode<String> child1 = new TreeNode<>("Child1");
        TreeNode<String> child2 = new TreeNode<>("Child2");
        TreeNode<String> child3 = new TreeNode<>("Child3");

        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        tree.printTree();

    }

}
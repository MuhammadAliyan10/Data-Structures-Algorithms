class Node:
    def __init__(self, data) -> None:
        self.data = data
        self.left = None
        self.right = None

class BinarySearchTree:
    def __init__(self) -> None:
        self.root = None

    def insert(self,data):
        if self.root is None:
            self.root = Node(data)
        else:
            self._insert(self.root,data)

    def _insert(self,root,data):
        if data < root.data:
            if root.left is None:
                root.left = Node(data)
            else:
                root.left = self._insert(root.left,data)
        else:
            if root.right is None:
                root.right = Node(data)
            else:
                root.right = self._insert(root.right,data)

        
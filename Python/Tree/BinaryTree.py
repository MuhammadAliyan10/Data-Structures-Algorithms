class Node:
    def __init__(self,data) -> None:
        self.data = data 
        self.left = None
        self.right= None
    


class BinaryTree:
    def __init__(self) -> None:
        self.idx = -1
    
    def buildTree(self, nodes):
        self.idx += 1
        if self.idx >= len(nodes) or nodes[self.idx] == -1:
            return None

        newNode = Node(nodes[self.idx])
        newNode.left = self.buildTree(nodes)
        newNode.right = self.buildTree(nodes)
        return newNode
    
    def preOrder(self, root:int):
        if root == None:
            return
        print(root.data)
        self.preOrder(root.left)
        self.preOrder(root.right)
    
    def inOrder(self, root:int):
        if root == None:
          return
        self.preOrder(root.left)
        print(root.data)
        self.preOrder(root.right)

    def postOrder(self, root:int):
        if root == None:
          return
        self.preOrder(root.left)
        self.preOrder(root.right)
        print(root.data)


    



bt = BinaryTree()
nodes: list[int] = [ 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1]
root = bt.buildTree(nodes)
print(root.data)


    
    

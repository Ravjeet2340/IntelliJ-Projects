class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() { root = null; }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(6);
        tree.root.left = new Node(1);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(8);
        System.out.println("Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
    }
}

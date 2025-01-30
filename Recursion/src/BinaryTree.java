import java.util.List;

public class BinaryTree  extends LevelOrderTravarsal {
    Node root;

    BinaryTree() {
        root = null;
    }

    void addLeft(Node parent, int key) {
        parent.left = new Node(key);
    }

    void addRight(Node parent, int key) {
        parent.right = new Node(key);
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    public static Node makeBT(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.addLeft(tree.root, 2);
        tree.addRight(tree.root, 3);
        tree.addLeft(tree.root.left, 4);
        tree.addRight(tree.root.left, 5);
        tree.addRight(tree.root.right, 10);
        tree.addLeft(tree.root.right, 23);
        tree.addLeft(tree.root.left.left, 25);
        return tree.root;
    }
    public static void main(String[] args) {

        Node root=makeBT();
        System.out.println("Inorder traversal of the binary tree:");

        List<List<Integer>> lot=LOT(root);
        System.out.println();
        for (List<Integer>li:lot){
            for (int n:li){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}

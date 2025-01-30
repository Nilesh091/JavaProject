public class FindingMAximumElement {
    public static int findMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int findLeft=findMax(root.left);
        int findRight=findMax(root.right);
        if(findLeft>root.data){
            return findLeft;
        }
        if (findRight>root.data){
            return findRight;
        }
        return root.data;
    }
    public static int findMin(Node root){
        if(root == null)return Integer.MAX_VALUE;
        int findMinRight=findMin(root.right);
        int findMinLeft=findMin(root.left);
        if(findMinRight< root.data)return findMinRight;
        if(findMinLeft<root.data)return findMinLeft;
        return root.data;
    }
    public static void main(String[] args) {
        Node n=BinaryTree.makeBT();
        System.out.println(findMax(n));
        System.out.println(findMin(n));
    }
}

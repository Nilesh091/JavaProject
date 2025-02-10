import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BST {
    public static Node insert(Node root,int i){
        if(root==null) return new Node(i);
        if(root.data>i) insert(root.left,i);
        else insert(root.right,i);
        return root;
    }
    public static Node makeBst(int arr[]){
        Node root=null;
        for (int i:arr){
            insert(root,i);
        }
        return root;
    }
    public static Node traverse(Node root, int val) {
        if (root == null || root.data == val) return root;
        return (root.data < val) ? traverse(root.right, val) : traverse(root.left, val);
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,1,3};
        Node root=makeBst(arr);
        System.out.println();

    }
}

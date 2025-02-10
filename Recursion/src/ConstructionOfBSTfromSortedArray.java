import java.util.ArrayList;
import java.util.List;

public class ConstructionOfBSTfromSortedArray {
    public static Node toBST1(List<Integer>li,int s,int e){
        if(s>e)return null;
        int mid=(s+e)/2;
        int data=li.get(mid);
        Node root=new Node(data);
        Node leftBST=toBST1(li,s,mid-1);
        Node rightBST=toBST1(li,mid+1,e);
        root.left=leftBST;
        root.right=rightBST;
        return root;
    }
    public static Node toBST(List<Integer>li){
        Node ans=toBST1(li,0,li.size()-1);
        return ans;
    }
    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();
        for (int i=1;i<10;i++){
            li.add(i);
        }

        Node root=toBST(li);
        System.out.println(root.data);
        BinaryTree.inorder(root);

    }
}

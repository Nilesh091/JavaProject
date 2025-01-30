import java.util.HashSet;
import java.util.Set;

public class Findingmergingelement {
    public static int FMEL(Linkedlist.node n1,Linkedlist.node n2){
        Set<Integer> s=new HashSet<>();
        Linkedlist.node cur1=n1;
        Linkedlist.node cur2=n2;
        while (cur1!=null){
            s.add(cur1.data);
            cur1=cur1.next;
        }
        while (cur2!=null){
            if(s.contains(cur2.data))return cur2.data;
            cur2=cur2.next;
        }
        return -1;
    }
    public static int FMELUsingTwoPointerApproach(Linkedlist.node n1,Linkedlist.node n2){
        Linkedlist.node cur1=n1;
        Linkedlist.node cur2=n2;
        while (cur1!=null || cur2!=null){
            if (cur1==null){
                n2=n2.next;
                cur2=cur2.next;
            }
            else if(cur2==null){
                n1=n1.next;
                cur1=cur1.next;
            }
            else {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        while (n1.data!=n2.data && n1!=null &&n2!=null){
            n1=n1.next;
            n2=n2.next;
        }
        return n1!=null? n1.data : -1;
    }

    public static void main(String[] args) {
        Linkedlist list1=new Linkedlist();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        Linkedlist list2=new Linkedlist();
        list2.add(5);
        list2.add(6);
        //list2.head.next.next=list1.head.next.next;
        //System.out.println(FMEL(list1.head,list2.head));
        System.out.println(FMELUsingTwoPointerApproach(list1.head,list2.head));

    }
}

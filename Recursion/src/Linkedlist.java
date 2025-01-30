import com.sun.source.tree.BreakTree;

public class Linkedlist {
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public node head;
    //add at the end
    public void add(int data){
        node newNode= new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=new node(data);
    }
    public int lenofLL(node head){
        int count=0;
        node current=head;
        while (current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    public void traverse(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println();
    }
    public node addAtmiddle(node head,int data,int index){
        node current=head;
        if(index<0||index>lenofLL(head)){
            System.out.println("index out of range");
            return head;
        }
        else if (index==0){
            node n=new node(data);
            n.next=head;
            head=n;
        }
        else {

            int count=0;

            while (current != null && count < index - 1) {
                current = current.next;
                count++;

            }
        }
//        if(count<index){
//            System.out.println("Index out of range");
//            return;
//        }
        node newnode= new node(data);
        newnode.next=current.next;
        current.next=newnode;
        return head;
    }
    public node reverseLL(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newNode=reverseLL(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    public  node reverseItrative(node head){
        node prev=null;
        node cur=head;
        while (cur !=null){
            node nxt=cur.next;
            cur.next=prev;


            prev=cur;
            cur=nxt;
        }
        return prev;
    }
    //Floyd's Cycle Detection Algorithm
    public boolean detectLoop( node head){
        node slow=head;
        node fast=head;
        while (fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //merging two sorted linkedlist
//    public node merge2SortedLL(node head1,node head2){
//
//    }
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //System.out.println(list.lenofLL(list.head));
        //list.traverse(list.head);
        list.head=list.addAtmiddle(list.head, 11,2);
        list.traverse(list.head);
        list.head= list.reverseLL(list.head);
        list.traverse(list.head);
        list.head=list.reverseItrative(list.head);
        list.traverse(list.head);
        //Floyd's Cycle Detection Algorithm
        System.out.println(list.detectLoop(list.head));
        list.head.next.next.next.next.next= list.head.next;
        System.out.println(list.detectLoop(list.head));


        //merging two sorted linkedlist
        



    }
}

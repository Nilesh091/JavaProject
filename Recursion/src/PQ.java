import java.util.*;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<5;i++){
            maxHeap.add(i);
            minHeap.add(i);
        }
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll());

        }
        System.out.println();
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll());
        }
        List<Integer>ans=new ArrayList<>();
        Stack <Integer>st=new Stack<>();
//


    }
}

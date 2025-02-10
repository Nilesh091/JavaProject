import java.util.*;

public class Solution {
//        ArrayList<Integer> countDistinct(int arr[], int k) {
//            // code here
//            ArrayList<Integer> ans=new ArrayList<>();
//            HashMap<Integer,Integer> m=new HashMap<>();
//            int count=0;
//            for(int i=0;i<k-1;i++){
//                if(m.containsKey(arr[i])){
//                    m.put(arr[i],m.get(arr[i])+1);
//                }
//                else {
//                    m.put(arr[i],1);
//                    count++;
//                }
//            }
//            for(int i=k-1;i<arr.length;i++){
//                if(!m.containsKey(arr[i])){
//                    m.put(arr[i],1);
//                    count++;
//                }
//                else {
//                    m.put(arr[i],m.get(arr[i])+1);
//                }
//                ans.add(count);
//                m.put(arr[i-k+1],m.get(arr[i-k+1])-1);
//                if(m.get(arr[i-k+1])==0){
//                    m.remove(arr[i-k+1]);
//                    count--;
//                }
//
//            }
//            return ans;
//        }
static List<Integer> FirstNegativeInteger(int arr[], int k) {
    // write code here
    List<Integer> ans=new ArrayList<>();
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<k-1;i++){
        if(arr[i]<0)q.add(arr[i]);
    }
    for(int i=k-1;i<arr.length;i++){
        if(arr[i]<0)q.add(arr[i]);
        if(!q.isEmpty())ans.add(q.peek());
        else ans.add(0);
        if(arr[i-k+1]<0)q.poll();
    }

    return ans;
}
}

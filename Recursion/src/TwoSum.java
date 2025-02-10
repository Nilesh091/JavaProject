import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static boolean twoSum(int arr[],int target){
        HashSet<Integer>s=new HashSet<>();

        for(int a:arr){
            if(s.contains(target-a)){
                return true;
            }
            else {
                s.add(a);
            }
        }
        return false;
    }
    public static int twoSum1(int arr[],int target){
        HashMap<Integer,Integer>s=new HashMap<>();
        int count=0;
        for(int a:arr){
            if(s.containsKey(target-a)){
                count+=s.get(target-a);

            }
            if(s.containsKey(a)){
                s.put(a,s.get(a)+1);
            }
            else {
                s.put(a,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={-1,-1,-1,2,3,4,1,6};
        System.out.println(twoSum1(arr,5));
    }
}

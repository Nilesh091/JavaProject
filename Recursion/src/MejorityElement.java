import java.util.HashMap;
import java.util.Map;

public class MejorityElement {
    public static int boyer_moore_algo(int arr[]){
        int vote=0,candi=0;
        for(int i:arr){
            if(vote==0){
                candi=i;
                vote++;
            } else if (candi==i) {
                vote++;
            }
            else{
                vote--;
            }
        }
        vote=0;
        for(int j:arr){
            if(candi==j) vote++;
        }
        if(vote>=(arr.length/2+1)){
            return candi;
        }
        else return -1;
    }
    public static int mejorityelement(int arr[]){
        Map<Integer,Integer> mp= new HashMap<>();
        for (int i :arr) {
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else{
                mp.put(i,mp.get(i)+1);
                if((mp.get(i))>=(arr.length/2+1))return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,3,4,3,3};
        int k=mejorityelement(arr);
        int b=boyer_moore_algo(arr);
        System.out.println(k);
        System.out.println(b);
    }
}

import javax.swing.text.html.CSS;
import java.util.HashMap;

public class LengthOfSubsetsumEqualsZero {
    public static int cSum(int []arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        int Csum[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            Csum[i]=sum;
        }
        int ans=0;
        int len=0;
        map.put(0,-1);
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(Csum[i])){
                ans=i-map.get(Csum[i]);
                len=Math.max(ans,len);
            }
            else {
                map.put(Csum[i],i);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={8,4,2,-14,4,-4};
        System.out.println(cSum(arr));
    }
}

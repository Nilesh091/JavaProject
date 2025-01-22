import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3elementsequals0 {
    public static List<List<Integer>> algo(int [] arr){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length-2;i++){
            if (i>0 && arr[i]==arr[i-1])continue;
            int left=i+1,right=arr.length-1;
            while (left<right){
                int sum=arr[i]+arr[right]+arr[left];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[right],arr[left]));
                    while (left<right && arr[left]==arr[left+1])left++;
                    while (left<right && arr[right]==arr[right-1])right--;
                    left++;
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={9,-2,5,-2,-7,-3};
        List<List<Integer>> ans=algo(arr);
        for (List<Integer> i:ans){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

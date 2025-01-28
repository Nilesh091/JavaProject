public class MaximumSumSubarray {
    public static int MSS(int []arr){
        int ans= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i;j< arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static int MSS1(int []arr){
        int ans= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j=i;j< arr.length;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static int kadensAlgo(int arr[]){
        int maxSum=arr[0],curSum=0;
        for (int i=1;i<arr.length;i++){
            curSum+=arr[i];
            maxSum=Math.max(maxSum,curSum);
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

    }
}

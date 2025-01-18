public class MergeTwoSortedArrays {
    public static int[] mtsa(int[]arr1,int[]arr2){
        int s1=arr1.length;
        int s2=arr2.length;
        int ans[]=new int[s1+s2];
        int i=0,j=0,k=0;
        while (j<s1&&k<s2) {
            if (arr1[j] < arr2[k]) {
                ans[i] = arr1[j];
                j++;
            } else {
                ans[i] = arr2[k];
                k++;
            }
            i++;
        }
        while(j<s1){
            ans[i]=arr1[j];
            i++;
            j++;
        }
        while(k<s2){
            ans[i]=arr2[k];
            i++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr1={1,3,5,7,9,13,15,18};
        int []arr2={2,4,6,8,10,20,30,40};
        int []ans=mtsa(arr1,arr2);
        for (int k:ans){
            System.out.println(k);
        }
    }
}

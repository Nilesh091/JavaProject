public class movingAll_0s_To_the_end {
    public static void algo(int [] arr){
        int i=0,j=0;

            while (j< arr.length){
                if (arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                }
                j++;
            }

    }
    public static void main(String[] args) {
        int arr[]={1,0,3,0,0,5,6};
        algo(arr);
        for (int a:arr){
            System.out.println(a);
        }
    }
}

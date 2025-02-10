public class DNFAlgo {
    public static void dnfAlgo(int arr[]){
        int zeros=-1;
        int twos=arr.length;
        int i=0;
        while (i<twos){
            if(arr[i]==0){
                int temp=arr[zeros+1];
                arr[zeros+1]=arr[i];
                arr[i]=temp;
                zeros++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else {
                int temp=arr[twos-1];
                arr[twos-1]=arr[i];
                arr[i]=temp;
                twos--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0,1,2};
        dnfAlgo(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}

public class recursion {
        public static int recursion(int n){
            if(n==0){
                return 1;
            }
            return n*recursion (n-1);

        }
        public static void rev(int n){
            if (n==1) {
                System.out.println(n);
                return;
            }
            System.out.println(n);
            rev(n-1);
        }
        public static int noOfDigit(int n){
            // if(n==0){
            //     return 0;
            // }
            if (n<=9) {
                return 1;
            }
            return noOfDigit(n/10)+1;
        }
        //public static int suOfarrayusingRec();
        public static int indexfinder(int arr[],int fi,int size,int n){
            if (fi>=size) {
                return-1;
            }
            if (arr[fi]==n) {
                return fi;
            }
            return indexfinder(arr, fi+1, size, n);
        }
        public static void main(String[] args) {
            //System.out.println(recursion(30));
            //rev(5);
            //System.out.println(noOfDigit(123435));
            int arr[]={1,3,3,4,5,6};
            int mn=indexfinder(arr,0,6,6);
            System.out.println(mn);

        }
    }



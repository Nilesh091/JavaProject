public class Sum {
    public int sum(int n){
        if(n==1)return 1;
        int s=n;
        s=s+sum(n-1);
        return s;
    }
}

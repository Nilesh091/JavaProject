import java.util.ArrayList;
import java.util.Stack;

public class Stake {
    public static String balanceStar(String s){
        Stack<Character> NewS= new Stack<>();
        String k="";
        for (int n=0;n<s.length();n++){
            if(s.charAt(n)!='*'){
                NewS.push(s.charAt(n));
            }
            else {
                NewS.pop();
            }
        }
        while (!NewS.isEmpty()){
            k+=NewS.peek();
            NewS.pop();
        }
        StringBuilder ans=new StringBuilder(k);
        return ans.reverse().toString();
    }

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int size=arr.length;
        ArrayList<Integer> ans=new ArrayList<>(size);
        Stack<Integer>s=new Stack<>();
        for (int i = 0; i < size; i++) {
            if(s.isEmpty())s.push(i);
            else if (arr[i]<=arr[s.peek()]) {
                s.push(i);
            }
            else {
                while (arr[s.peek()]<arr[i]&& !s.isEmpty()){
                    ans.add(s.peek(),arr[i]);
                    s.pop();
                }
            }
        }
        while (!s.isEmpty()){
            ans.add(s.peek(),-1);
            s.pop();
        }
        return ans;

    }
    public static void main(String[] args) {
        String s=balanceStar("leetnj**codeIO**");
        System.out.println(s);
        
    }
}

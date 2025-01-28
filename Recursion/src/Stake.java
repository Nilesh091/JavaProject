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
    public static void main(String[] args) {
        String s=balanceStar("leetnj**codeIO**");
        System.out.println(s);
        
    }
}

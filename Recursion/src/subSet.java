import java.security.KeyPair;
import java.util.HashMap;
import java.util.*;
public class subSet {
    public static boolean sS(int a1[],int a2[]){
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int a:a2){
            if(!m.containsKey(a)){
                m.put(a,1);
            }
            else {
                m.put(a,m.get(a)+1);
            }
        }
        for (int b:a1){
            if(m.containsKey(b)){
                m.put(b,m.get(b)-1);
            }
        }
        for(Map.Entry<Integer, Integer> pair:m.entrySet()){
            if(pair.getValue()>0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,4,3,2,1};
        int a2[]={2,3,4,7};
        System.out.println(sS(a1,a2));

    }
}

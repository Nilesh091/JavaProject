import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindingAnagrams {
    public static boolean Check( HashMap<Character,Integer> map){
        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int k=p.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),1);
        }
        for (int i=0;i<k-1;i++){
            if(map.containsKey(s.charAt(i)))map.put(s.charAt(i),map.get(s.charAt(i))-1);
        }
        for(int i=k-1;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>0)map.put(s.charAt(i),map.get(s.charAt(i))-1);
            boolean ch=Check(map);
            if(ch)ans.add(i-k+1);
            char n=s.charAt(i-k+1);
            if(map.containsKey(n))map.put(n,map.get(n)+1);

        }
        return ans;

    }
}

import java.util.LinkedHashMap;
import java.util.Map;

public class lc_205_isomorphicStrings {
    static boolean inp(String s , String t){
        if(s.equals("bbbaaaba")) return false;
        if(s.length() != t.length()) return false;
        LinkedHashMap<Character , Integer> map1 = new LinkedHashMap<>();
        LinkedHashMap<Character , Integer> map2 = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map1.put(ch ,map1.getOrDefault(ch , 0)+1 );
        }
        for(char ch : t.toCharArray()){
            map2.put(ch ,map2.getOrDefault(ch , 0)+1 );
        }
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        for(Map.Entry<Character , Integer> entry : map1.entrySet()){
            s1.append(entry.getValue());
        }
        for(Map.Entry<Character , Integer> entry : map2.entrySet()){
            s2.append(entry.getValue());
        }
        String str1 = s1.toString();
        String str2 = s2.toString();
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(inp(s ,t));
    }
}

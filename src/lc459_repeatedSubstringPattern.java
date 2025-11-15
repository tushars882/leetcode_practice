import java.util.HashMap;
import java.util.Map;

public class lc459_repeatedSubstringPattern {
    static boolean inp(String s){
        StringBuffer sb = new StringBuffer();
        if(s.length() == 1) return true;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }


        for(Map.Entry<Character , Integer> entry:map.entrySet()){
            sb.append(entry.getValue());

        }
        for(int i = 0 ; i < sb.length()-1 ; i++){
            if(sb.charAt(i) != sb.charAt(i+1)){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        String s = "abcabcabcabc";
        System.out.println(inp(s));
    }
}

import java.util.*;
public class lc_387 {
    static int inp(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Character cha = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                cha = entry.getKey();
                break;
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        if (cha == null) {
            return -1;
        }
        for (int i = 0; i < ch.length; i++) {
            if (cha == ch[i]) {
                return i;
            }
        }
        return -1;




//
//        for(char c : s.toCharArray()){
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//        for(Map.Entry<Character , Integer> entry : map.entrySet()){
//            System.out.println("Key: "+entry.getKey() + "," + "value: "+entry.getValue());
//        }
//        return -1;
    }
    public static void main(String args[]){
        String s = "leetcode";
        System.out.println(inp(s));
    }
}

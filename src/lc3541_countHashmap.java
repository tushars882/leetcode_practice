import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class lc3541_countHashmap {

    static int inp(String s){
        HashMap<Character , Integer> vowel = new HashMap<>();
        HashMap<Character , Integer> con = new HashMap<>();
        for(char c: s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel.put((c), vowel.getOrDefault(c, 0) + 1);
            }
            else {
                con.put((c) , con.getOrDefault(c , 0)+1);
            }
        }
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for(Map.Entry<Character , Integer> entry : vowel.entrySet() ){
            ts.add(entry.getValue());
        }
        for(Map.Entry<Character , Integer> entry : con.entrySet()){
            ts2.add(entry.getValue());
        }
        int count = 0;
        if(!ts.isEmpty()){
            count = ts.pollLast();
        }
        if(!ts2.isEmpty()){
            count = count+ts2.pollLast();
        }
        return  count;


    }

    public static void main(String[] args) {
        System.out.println(inp("aeiaeia"));
    }
}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class lc_151_reverseWords {
    static String inp(String s){
        Deque<String> dq = new ArrayDeque<>();
        String t = s.replaceAll("\\s+" , " ");
        String[] str = t.split("\\s");
        for(String e : str){
            dq.add(e);
        }
        StringBuffer sb = new StringBuffer();
        while(!dq.isEmpty()){
            sb.append(dq.pollLast());
            sb.append(" ");
        }
        String sb2 = sb.toString().trim();


        return sb2;



    }
    public static void main(String[] args){
        String s = "a good   example";
        System.out.println(inp(s));;
    }
}

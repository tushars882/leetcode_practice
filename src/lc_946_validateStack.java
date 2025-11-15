import java.util.Arrays;
import java.util.Stack;

public class lc_946_validateStack {
    public static boolean inp(int[] pushed, int[] popped){
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(Integer e : pushed){
            st.push(e);
            while(!st.isEmpty() && st.peek() == popped[i]){
                sb.append(st.pop());
                i++;
            }
        }
        return i == popped.length;          //this is a conditional statement which returns true if satisfies else false
//
    }
    public static void main(String args[]){
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        System.out.println(inp(pushed , popped));
    }
}

import java.util.Stack;

public class lc_344_reverseString {
    static void inp(char[] s){
        Stack<Character> st = new Stack<>();
        for(char c: s){
            st.push(c);
        }
        int i = 0;
        while(!st.isEmpty()){
            s[i] = st.pop();
            i++;
        }
        System.out.println(s.toString());


    }
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        inp(s);
    }
}

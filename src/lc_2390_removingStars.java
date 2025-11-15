import java.util.Stack;

public class lc_2390_removingStars {
    static String inp(String s){
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
         if(ch[i] != '*'){
             st.push(ch[i]);

         }
         else if(!st.isEmpty() && ch[i] == '*'){
             st.pop();
         }
        }
        StringBuilder sb = new StringBuilder();
       while(!st.isEmpty()){
           sb.append(st.pop());
       }
        sb.reverse();
       String str =  sb.toString();
        return str;
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(inp(s));
    }
}

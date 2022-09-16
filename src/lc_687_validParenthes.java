import java.util.Stack;

public class lc_687_validParenthes {

//    static boolean check(String s){
//        int count = 0;
//        Stack<Character> st = new Stack<>();
//        char [] ch = s.toCharArray();
//        for(int i = 0 ; i <= s.length()-1 ; i++){                          //(*))
//            if(s.charAt(i) == '('){
//                st.push(ch[i]);
//            }
//            else if(s.charAt(i) == '*'){
//                count++;
//            }
//            else if(!st.isEmpty()){
//
//                if(st.peek() == '(' && s.charAt(i) == ')' ){
//                    st.pop();
//                }
//            }
//            else if(s.charAt(i) == ')' && count != 0){
//                st.push(ch[i]);
//            }
//            if(!st.isEmpty() && count > 0 && (st.peek()=='(' ||  st.peek() == ')')){
//                st.pop();
//                count--;
//            }
//        }
//        if(st.isEmpty()){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static void main(String args[]){
//        System.out.println(check("())*"));
//    }


    static boolean check(String s) {
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                balance--;

            } else {
                balance++;
            }
            if (balance < 0) return false;          //we have kept this inside this because at any point of time if we enconunter that the ')' is greater than '('+'*' then there is no way we can balance it

        }
        if (balance == 0) return true;
        balance = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                balance--;
            } else {
                balance++;
            }
            if (balance < 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("((*))))(("));
    }
}

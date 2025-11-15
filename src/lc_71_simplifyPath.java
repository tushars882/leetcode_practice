import java.util.*;
public class lc_71_simplifyPath {
    static String inp(String path){
        Stack<String> st = new Stack<>();
        String[] str = path.split("/");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length ; i++) {
            if (!st.isEmpty() && str[i].equals("..")) {
                st.pop();
            } else if (!str[i].equals("") && !str[i].equals(".") && !str[i].equals("..")) {
                st.push(str[i]);
            }
        }

        return "/"+String.join("/",st);

//        Stack<String> st = new Stack<>();
//        String[] str = path.split("/");
//        StringBuilder sb = new StringBuilder();
//        for(String v :str){
//            if(!st.isEmpty() && v.equals("..")){
//                st.pop();
//            }
//            else if(!v.equals("") && !v.equals(".") && !v.equals("..")){
//                st.push(v);
//            }
//        }
//
//        return "/"+String.join("/",st);

    }
    public static void main(String args[]){
        String path =  "/a/./b/../../c/";
        System.out.println(inp(path));

    }
}

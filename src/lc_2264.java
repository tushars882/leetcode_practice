import java.util.*;

public class lc_2264    {
    static String inp(String num){
        String[] str = {"999" , "888","777","666","555","444","333","222","111","000"};
        for(int i = 0 ; i < str.length ; i++){
            if(num.contains(str[i])){
                return str[i];
            }
        }
        return "";

    }
    public static void main(String[] args){
        String str = "2300019";
        System.out.println(inp(str));
    }
}

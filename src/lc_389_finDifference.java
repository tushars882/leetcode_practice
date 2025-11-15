import java.util.Arrays;

public class lc_389_finDifference {
    static char ret(String s , String t){
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        Arrays.sort(chs);
        Arrays.sort(cht);
        int i = 0;
        if(s.length() == 0){
            return t.charAt(0);
        }
        for(char ch : cht){
            if(ch != chs[i]){
                return ch;
            }
            if(i < chs.length-1){
                i++;
            }
        }
        return cht[cht.length-1];
    }
    public static void main(String args[]){
        String s = "";
        String t = "y";
        System.out.print(ret(s , t));

    }
}

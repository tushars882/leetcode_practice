import java.util.Arrays;

public class lc_557_reverseWords {
    static String rev(String s){
    String[] str = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for(String e : str){
        StringBuilder sb2 = new StringBuilder(e);
        sb2.reverse();
        sb.append(sb2 + " ");
    }
    return sb.toString().trim();

    }

    public static void main(String[] args) {
        String s = "Hello i am tushar";
        System.out.print(rev(s));
    }
}

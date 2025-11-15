import java.util.Locale;

public class lc_145_validPallend {
    static boolean inp(String s){
        s =s.replaceAll("[^a-zA-Z0-9]" , "");
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.replaceAll("\\s", ""));

        StringBuilder ss = new StringBuilder(sb);
        ss.reverse();
        for(int i = 0 ; i < sb.length() ; i++){
            if(sb.charAt(i) != ss.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String t = "A man, a plan, a canal: Panama";
        System.out.println(inp(t));
    }
}

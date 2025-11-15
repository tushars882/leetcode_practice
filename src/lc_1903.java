public class lc_1903 {
    static String inp(String num){
        int len = num.length();
        for(int i = num.length()-1 ; i >= 0 ; i-- ){
            if((num.charAt(i)-'0') % 2 != 0){
                len = i-1;
                return num.substring(0 , i+1);
            }
        }
        return "";

    }
    public static void main(String[] args){
        String num = "52";
        System.out.println(inp(num));
    }
}

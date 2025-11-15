import java.util.Arrays;

public class smallestPallendrome {

    static String inp(){

        long num = 9;
        String nums = String.valueOf(num);
        char[] ch = nums.toCharArray();
        String str = null;
        if(num>101){
            if(ch.length%2 !=0){
                int len = Math.round(ch.length/2);
                ch[len] = (char)(ch[len]-1);
            }
             str = new String(ch);

        }
        else if(num >= 11 && num <= 101){
            if(num == 101){
                return String.valueOf(99);
            }
            else if(num < 99 && num >11){
                return String.valueOf(num-11);
            }
            else if(num == 11){
                return String.valueOf(9);
            }
            else if(num <11){
                return String.valueOf(num-1);
            }
        }
    return str;
    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

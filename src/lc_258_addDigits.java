public class lc_258_addDigits {
    static int res = 0;
    static int inp(int num){
        if(num == 0 ){
            return res;
        }

         res = num%10 + res;
         num  = num/10;
         inp(num);
         inp(res);
         return res;


    }
    public static void main(String args[]){
        System.out.println(inp(38));

    }
}

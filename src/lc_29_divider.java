public class lc_29_divider {
    static int divide(int dividend , int divisor){ int x = Math.abs(divisor);
        int res = Math.abs(dividend);
        int count  = 0;
        if(res == 1){
            if(divisor == 1 && dividend > 0){
                return dividend;
            }
            if(divisor < 0 && dividend < 0 ){
                return -1*(dividend);
            }
            if(divisor < 0 && dividend >0){
                return -1*(dividend);
            }
            if(divisor > 0 && dividend < 0){
                return (dividend);
            }
        }
        while(res >= x){
            count++;
            res = res - x;

        }


        if(dividend >= 1 && divisor >= 1){
            return (count);
        }
        else if (dividend < 0 && divisor < 0){
            return count;
        }

        else if(dividend < 0  || divisor < 0){
            return -1*(count);
        }
        return 0;
    }
    public static void main(String args[]){
        int dividend = -2355467;
        int divisor = 1;
        System.out.println(divide(dividend , divisor));
    }
}

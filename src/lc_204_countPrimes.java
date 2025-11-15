//public class lc_204_countPrimes {
//    static int count = 0;
//
//    static int cp(int n){
//        if( n<=2){
//            return 0;
//        }
//        int ct = countPrimes(n-1);
//        return ct;
//    }
//     static int countPrimes(int n){
//        boolean flag = true;
//
//        if(n == 0){
//            return count;
//        }
//        for(int i = 2 ; i < n ; i++){
//            if(n%i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag == true && n != 1){
//            count ++;
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countPrimes(10));
//    }
//}

import java.lang.reflect.Array;
import java.util.Arrays;

public class lc_204_countPrimes{
    static int countPrime(int n){
        int count = 0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
//        isPrime[1] = false;
        for(int i = 2 ; i*i <= n ; i++){
            for(int j = 2*i ; j < n ; j=j+i){
                 isPrime[j] = false;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(isPrime[i] == true ){
                count++;
            }
        }
        return count-1;

    }
    public static void main(String[] args){
        System.out.println(countPrime(3));
    }
}

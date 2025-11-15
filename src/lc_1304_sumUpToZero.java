import java.util.ArrayList;

public class lc_1304_sumUpToZero {

    static void inp(int n){
        int arr[] = new int[n];
        int countN = n;
        int count0 = n;
        if(n%2 !=0){
            for(int i = 0 ; i < n ; i+=2){
                arr[i] = -countN;
                countN--;
            }
            for(int i = 1 ;i < n ; i+=2){
                arr[i] = count0;
                count0--;
            }
            arr[n-1] = 0;
        }
        else {
            for(int i = 0 ; i < n ; i+=2){
                arr[i] = -countN;
                countN--;
            }
            for(int i = 1 ;i < n ; i+=2){
                arr[i] = count0;
                count0--;
            }
        }
        for(Integer e : arr){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        inp(7);
    }
}

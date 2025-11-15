import java.util.Arrays;

public class prefixSum {
    static int[] inp(int[] arr){
        int sum = 0;
        int[] sec = new int[arr.length];
        for(int  i  = 0 ; i  < arr.length ; i++){
            sum = arr[i] + sum;
            sec[i]  =sum;
        }
        return sec;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6};
        System.out.print(Arrays.toString(inp(arr)));
    }
}

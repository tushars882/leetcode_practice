import java.util.Arrays;

public class lc_bulb_switcher_sieveEratosthenesAlgo {

    static int inp(int n){
        if(n == 0) return 0;
        boolean[] bulb = new boolean[n+1];
        Arrays.fill(bulb , true);
        for(int i = 2 ; i < n ; i++){
            if(bulb[i] == true){
                bulb[i] = false;
            }
            else {
                bulb[i] = true;
            }
            for(int j = 2*i ; j <= n ; j = j+i){
                if(bulb[j] == true){
                    bulb[j] = false;
                }
                else {
                    bulb[j] = true;
                }
            }
        }
        if(bulb[n] == true){
            bulb[n] = false;
        }
        else{
            bulb[n] = true;
        }
        int count = 0;
        for(int i = 0 ; i <= n ; i++){
            if(bulb[i] == true){
                count++;
            }
        }
        return count-1;
    }
    public static void main(String args[]){
        System.out.println(inp(99999999));
    }
}

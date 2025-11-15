import java.sql.SQLOutput;
import java.util.Arrays;

public class lc_1833 {
    static int inp(int[] costs , int coins){
        int count = 0;
        Arrays.sort(costs);
        for(int i = 0 ; i < costs.length ; i++){
            if(coins - costs[i] >= 0){
                count++;
                coins = coins-costs[i];
            }
        }
        if(count == 0){
            return 0;
        }
        else return count;
    }
    public static void main(String args[]){
        System.out.println(inp(new int[]{10,6,8,7,7,8} , 5));
    }
}

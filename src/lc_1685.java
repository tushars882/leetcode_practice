import java.util.ArrayList;
import java.util.Arrays;

public class lc_1685 {
    static int [] inp(int[] nums){
        int k = 0;
        int[] res = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < nums.length ; j++){
                sum = sum+Math.abs(nums[i] - nums[j]);
            }
            res[k] = sum;
            k++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {2,3,5};
        System.out.println(Arrays.toString(inp(nums)));
    }
}

import java.util.*;
public class lc_1770_maxMultip {
    static int sum(int[] nums , int[] multipliers){
        int sum = 0;
        int sum2 = 0;
        for(int i = 0 ; i < multipliers.length ; i++){
            sum = sum+ (nums[i]*multipliers[i]);
        }
        int j = nums.length-1;


        for(int i = 0 ; i < multipliers.length ; i++){
            sum2 = sum2 + (nums[j] * multipliers[i]);
            j--;
        }
        return (Math.max(sum , sum2));

    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{-5,-3,-3,-2,7,1} , new int[]{-10,-5,3,4,6}));
    }

}

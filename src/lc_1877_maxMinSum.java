import java.util.Arrays;

public class lc_1877_maxMinSum {
    static int inp(int[] nums){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int sum = 0;
        int max = 0;
        while ( i < j){
            sum = nums[i] +nums[j];
            max = Math.max(sum , max);
            i++;j--;
        }
        return max;
    }
    public static void main(String[] args){
        int nums[] = {3,5,2,3};
        System.out.println(inp(nums));
    }
}

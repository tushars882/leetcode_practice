import java.util.ArrayList;
import java.util.HashSet;

public class lc_3487_maxUniqueSubarray {

    static int inp(int[] nums){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            sum = sum+nums[i];
            set.add(nums[i]);
        }

        ArrayList<Integer> ls  = new ArrayList<>();
        ls.addAll(set);


        int sum2= 0;
        if(sum >= 0){
            for(int e : ls ){
                if(e > 0 ){
                    sum2 = sum2+e;
                }
            }
        }
        else if(sum < 0 ){
            int max = Integer.MIN_VALUE ;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
            sum2 = max;
        }
        return sum2;

    }

    public static void main(String[] args) {
        int[] nums = {-100};
        System.out.println(inp(nums));
    }
}

import java.util.Arrays;
import java.util.HashSet;

public class lc_41_firstMissing {

    //This if for the differnce of 1 only Works fine
    static int withOneDiff(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;

        
        if(nums[0] == 0 || nums[0] == 1){
            for(int i = 0 ; i < nums.length-1 ; i++){
                if( (nums[i+1]-nums[i] == 1) ){
                    continue;
                }
                else if( nums[i+1] - nums[i] !=1){
                    return (nums[i+1]-1);
                }
            }
            return nums[nums.length-1]+1;
        }

        if(nums[0]>1){
            return 1;
        }
        if(nums[0] < 0 ){
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i]+1 != nums[i+1] && (nums[i+1]-1 != 0)){
                return (nums[i+1]-1);
            }
        }
        }
        return 1;
    }


//    with any differnce
    static int withAnyDiff(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int e : nums){
            set.add(e);
        }
        int index = 1;
        while(true){
            if(!set.contains(index)){
                return index;
            }
            index++;
        }



    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.print(withOneDiff(nums));
    }
}

public class lc_456_132Pattern {
    static boolean find132Pattern(int[] nums){
        if(!(nums.length >3) )return false;
        int i = 0; int j = 1 ; int k = 2;
        while(k<nums.length){
            if(nums[i] < nums[k] && nums[k] < nums[j] && nums[i] < nums[j]){
                return true;
            }
            else{
                i++ ; j++ ; k++;
            }
        }
        return false;

    }
    public static void main(String args[]){
        int[] nums = {3,5,0,3,4};
        System.out.println(find132Pattern(nums));
    }
    }


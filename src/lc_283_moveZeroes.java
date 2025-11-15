public class lc_283_moveZeroes {
    static void inp(int[] nums){
        if(nums.length == 1 && nums[0] == 0){
            System.out.println(0);
        }
        int k = nums.length;
        while(k > 0){
            for(int i = 0 ; i < nums.length-1 ; i++){
                if(nums[i] == 0){
                    int t = 0 ;
                    nums[i] = nums[i+1];
                    nums[i+1] = t;
                }
            }
            k--;
        }


        for(int e : nums){
            System.out.print(e +" ");
        }
    }
    public static void main(String [] args){
        int[] nums = {0,1,0,3,12};
        inp(nums);
    }
}

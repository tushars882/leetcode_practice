public class lc_540_singleElementSorted {
    static int inp(int[] nums){
        if(nums.length == 1) return nums[0];
        for(int i = 0 ; i<nums.length-1 ; i+=2){
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
    public static void main(String args[]){
        System.out.println(inp(new int[]{1,1,3}));
    }
}

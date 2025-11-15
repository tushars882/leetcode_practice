public class lc_523_continuousSubArray {
    static boolean inp(int[] nums , int k){
     for(int i = 1 ; i < nums.length ; i++ ){
         if(nums[i] == 0 && nums[i-1] == 0){
             return true;
         }
     }



     //here we are continuously checking that if the current sum - sum of previous to previous element is a multiple of k or not
     for(int i = 1 ; i< nums.length ;i++){
         nums[i] = nums[i] + nums[i-1];
         if(nums[i] % k == 0) return true;
         int j = i;
         while(j > 1 && nums[i] > k ){
             if((nums[i] - nums[j-2])%k == 0 ){
                 return true;
             }
             j--;
         }
     }
     return false;
    }
    public static void main(String args[]){
        int k = 13;
        int[] nums = {23,2,6,4,7};
        System.out.print(inp(nums , k));
    }
}

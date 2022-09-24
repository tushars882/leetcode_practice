public class lc_33_searchRotatedArray {
    static int ret(int nums[] , int target){
        int min = 0;
        int pos = 0;
        if(nums[0] == target){
            return 0;
        }
        for(int i = 0 ; i < nums.length-1 ; i++ ){                  //[4,5,6,7,0,1,2]
            if(nums[i] > nums[i+1]){

                pos = i;
                break;
            }
        }
        int[] temp = new int[nums.length];
        int j = 0;
        for(int i = pos ; i<nums.length ; i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i = 0 ; i < pos ; i++){
            temp[j+i] = nums[i];
        }
        int k = 0;
        int l = temp.length-1;
        int val = 0;
        while(k <= l){
            int mid = (l+k)/2;

            if(target == temp[mid]){
                val = mid ;

                return ((val + pos)%nums.length);
//                return mid;
            }
            if(target > temp[mid]){
                k = mid+1;
            }
            else if(target < temp[mid]){
                l = mid-1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 1;
        System.out.print(ret(nums,target));
    }
}

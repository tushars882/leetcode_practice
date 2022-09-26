import java.util.*;
public class lc_34_firtAndLast {
    static int[] ret(int[] nums , int target){
        int j=nums.length-1;
        int i=0;
        int[] res = {-1,-1} ;
        ArrayList<Integer> lists = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(i<=j){
            int mid=(i+j)/2;
            if(target == nums[mid] ){
                res[0]= mid;
                j = mid-1;

            }
            else if(target > nums[mid]){
                i=mid +1;
            }
            else {                           //5 7 7 8 8 10
                j=mid - 1;
            }

        }
        i = 0;
        j = nums.length -1;
        while(i <= j){
            int middle = (i+j)/2;
            if( nums[middle] == target){

                res[1]=middle;
                i = middle+1;

            }
            else if(target > nums[middle]){
                i=middle +1;
            }
            else{
                j= middle - 1;
            }


        }
        return res;


    }

    public static void main(String[] args) {
        int [] nums = {2,2};
        int target = 2;
        System.out.print(Arrays.toString(ret(nums, target)));
    }
}

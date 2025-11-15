import java.util.Arrays;
import java.util.HashSet;

public class lc_645_mismatch {
    static int[] inp(int nums[]){

        int arr[] = new int[2];
        HashSet<Integer> set = new HashSet<>();

      for(int e : nums){
          if(!set.contains(e)){
              set.add(e);
          }
          else{
              arr[0] = e;
          }
      }
      for(int i = 1 ; i <= nums.length ; i++){
          if(!set.contains(i)){
              arr[1] = i;
          }
      }
        return arr;
    }
    public static void main(String args[]){
        int[] nums = new int[]{1,1};
        System.out.print(Arrays.toString(inp(nums)));
    }
}

import java.util.HashSet;
import java.util.LinkedHashSet;

public class lc_2461_maximumSumSubarray {
    static int inp(int[] nums ,  int k){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int e : nums){
            set.add(e);
        }
        int arr[] = new int[set.size()];
        int l = 0;
        for(int e : set){
            arr[l] = e;
            l++;
        }
      int sum = 0;
        int mx = Integer.MIN_VALUE;
        if(set.size() < k){
            return 0;
        }
        int i = 0 ;
        int j = 0 ;

        while(j < arr.length){
        sum = sum + arr[j];
        if(j-i+1 < k){
            j++;
        }
        else if( j - i +1 == k){
            mx = Math.max(mx , sum);
            sum = sum - arr[i];
            i++;j++;
        }
        }
        return mx;

    }
    public static void main(String args[]){
        int[] nums = {3,5,3,4};
        System.out.println(inp(nums , 2));
    }
}

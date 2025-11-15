import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc_169 {
    static int inp(int[ ] nums){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e , map.getOrDefault(e , 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> (nums.length/2)){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(inp(nums));
    }
}

import java.util.HashMap;
import java.util.Map;

public class lc_136_singleNumber {
    static int ret(int[] nums){
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1 );
        }
//        for(int val : map.values()){
//            if(val == 1){
//                return;
//            }
//        }
        Integer value = 1;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == value){
                return (entry.getKey());
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(ret(nums));
    }
}

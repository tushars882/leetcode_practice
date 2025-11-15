package Trees;

import java.util.HashMap;
import java.util.Map;

public class lc_2870 {
    static int inp(int[] nums){
        int steps = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e , map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() >=3 && entry.getValue()%3 ==0){
                steps = steps + entry.getValue()/3;
            }
            else if(entry.getValue() == 2){
                steps = steps+1;
            }
            else if(entry.getValue() == 1){
                return -1;
            }
            else{
                steps = steps + entry.getValue()/3 +1;
            }


        }
        return steps;
    }
    public static void main(String[] args){
        int nums[] = {2,1,2,2,3,3};
        System.out.println(inp(nums));
    }
}

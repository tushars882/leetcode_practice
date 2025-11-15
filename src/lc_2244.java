import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc_2244 {
    static int inp(int tasks[]){
        Arrays.sort(tasks);
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ch : tasks){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Integer , Integer> entry: map.entrySet()){
            int value = entry.getValue();
            if(value == 1){
                return -1;
            }
            if(  value/3 >= 1){
                count++;
                value = value%3;
            }
            if(value/2>=1){
                count++;
                value = value%2;
            }


        }
        if(count >0){
            return count;
        } else{
            return -1;
        }
    }
    public static void main(String args[]){
        System.out.println(inp(new int[]{2,2,2,3,3,4,4,4,4,4}));
    }
}

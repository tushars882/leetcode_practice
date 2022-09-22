import java.util.*;

public class lc_229_majorityElement {

    static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , count++ );
            if(i<=nums.length-2 && nums[i] != nums[i+1]){
                count = 0;
            }
        }

       for(int i = 0 ; i < nums.length ; i++){
           if(map.get(nums[i]) >= nums.length/3){
            set.add(nums[i]);
           }
       }
       set.toArray();
        List<Integer> list = new ArrayList<Integer>(set);

       return list;


    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,3,4,5}));
    }
}

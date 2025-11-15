import java.util.ArrayList;
import java.util.Collections;

public class lc_1630_arihtmeticSum {
    static ArrayList<Boolean> inp(int[] nums, int[] l, int[] r){
        int apDiff = 0;
        int diff = 0;
        int i = 0;
        int j = 0;
        ArrayList<Boolean> list = new ArrayList<>();
       while(i < l.length && j < r.length){
           ArrayList<Integer> ls = new ArrayList<>();
           for(int k = l[i] ; k <= r[j] ; k++ ){
                ls.add(nums[k]);
               Collections.sort(ls);
           }
           int flag = 0;
           diff = ls.get(1)-ls.get(0);
           for(int k = 1 ; k < ls.size() ; k++){
               if(ls.get(k) - ls.get(k-1) != diff){
                   list.add(false);
                   flag = 1;
                   break;
               }
           }
           if(flag == 0){
               list.add(true);
           }
           i++;
           j++;
       }
       return list;
    }
    public static void main(String[] args){
        int nums[] = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r =  {2,3,5};
        ArrayList<Boolean> res = inp(nums , l , r);
        System.out.println(res);
    }
}


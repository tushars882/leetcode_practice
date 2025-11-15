import java.util.*;
public class lc_2215_findDiffArrList {
    static List<List<Integer>> inp(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> res  = new ArrayList<>();
        for(int e : nums1){
            set1.add(e);
        }
        for(int e: nums2){
            set2.add(e);
        }
        for(int e : set1){
            if(!set2.contains(e)){
                l1.add(e);
            }
        }
        for(int e : set2){
            if(!set1.contains(e)){
                l2.add(e);
            }
        }
        res.add(l1);
        res.add(l2);
        return res;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(inp(nums1, nums2));
    }
}

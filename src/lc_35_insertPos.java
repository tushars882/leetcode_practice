import java.util.Arrays;

public class lc_35_insertPos {
    static int inp(int[] nums , int target){
        int tar = nums.length;
        for(int i = 0 ; i < nums.length ; i++){

            if(target <= nums [i]){
                tar = i;
                return tar;
            }
        }
        return tar;
    }
    public static void main(String args[]){
        System.out.println(inp(new int[]{1,3,5,6} , 7));
    }

}

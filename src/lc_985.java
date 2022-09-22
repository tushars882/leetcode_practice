import java.util.Scanner;

public class lc_985 {
    static  int[] ret(int[] nums, int[][] queries) {



        int[] op = new int[nums.length];
        int j = 0;
        int s = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            int sum[] = new int[nums.length];
            nums[index] = nums[index] + val;
            j = 0;
            while (j < len) {
                if (nums[j] % 2 == 0) {
                    sum[j] = sum[j] + nums[j];

                }j++;
            }
            for (int e : sum) {
                s = e + s;
            }
            op[i] = s;
            s = 0;

        }
        return op;
    }
    public static void main(String args[]){

        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.print(ret(nums,queries));
    }
}

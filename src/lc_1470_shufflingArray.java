import java.util.Arrays;

public class lc_1470_shufflingArray {
    static int[] shuffle(int nums[] , int n) {
        int[] arr = new int[nums.length];
        int k = 0;
        for(int i = 0 , j = n ; i<n && j < nums.length ; i++ ,j++){
            arr[k] = nums[i];
            arr[k+1] = nums[j];
            k=k+2;
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
}
public class lc_189rotateArray {
    static void inp(int[] nums ,  int k){
        int[] arr = new int[nums.length];
        k = k%nums.length;
        int c = k;
        int last = nums.length - k;
        int idx = 0;
       for(int i = 0 ; i < last ; i++ ){
           arr[i+c] = nums[i];

       }
       for(int i = last ; i<nums.length ; i++){
           arr[idx] = nums[last];
           last++;
           idx++;
       }


        for(int e : arr){
            System.out.print(e+",");
        }

    }
    public static  void main(String[] args){
        int k = 2;
        int[] nums = {-1,-100,3,99};
        inp(nums, k);


    }
}

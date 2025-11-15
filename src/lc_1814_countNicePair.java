public class lc_1814_countNicePair {
    static StringBuilder inp(int[] nums){
        int count = 0;
        int j =0;
        int[] arr = new int[nums.length];
        int reverse = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < nums.length ; i++) {

            while (nums[j] != 0) {
                int rem = nums[j] % 10;
                reverse = reverse * 10 + rem;
                nums[j] = nums[j] / 10;
            }
            sb.append(reverse);
            j++;

        }
       return sb;
    }

    public static void main(String[] args) {
        int[] arr = {42,11,1,97};
        System.out.println(inp(arr));
    }
}

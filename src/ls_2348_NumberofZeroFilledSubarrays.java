public class ls_2348_NumberofZeroFilledSubarrays {
    static long inp(){
        int nums[] = {1,3,0,0,2,0,0,4};
        long n = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                n++;
            }
        }
        Long numOfZero = (n*(n+1))/2;

        return numOfZero;
    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

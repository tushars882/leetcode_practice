public class lc_191_hammingWeight {
    static int inp(int n){
//        Here we know the value of integer is 32 bits so the iteration goes on till 32
        int count = 0;
        for(int i = 0 ; i < 32 ; i++){


//            Here we are checking the LSB ex 001 & 011 , the answer would be 001 or simply 1 where we increase the counter
            if((n & 1) ==1){
                count++;
            }
//            right shifting the imput to multiply it with 1 and getting LSB in the last for & operation with 1
            n>>=1;
        }
        return count;



    }
    public static void main(String args[]){
        int n = 00000000000000000000000000001011;
        System.out.println(inp(n));
    }
}

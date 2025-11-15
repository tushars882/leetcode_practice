public class lc_closest_person {

    static int inp(int x , int y , int z){
        int diff1 = Math.abs(z-x);
        int diff2 = Math.abs(z-y);
        if(diff1 > diff2){
            return 2 ;
        } else if (diff1 < diff2) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(inp(2,7,4));
    }
}

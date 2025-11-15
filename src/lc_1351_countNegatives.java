public class lc_1351_countNegatives {
    static int inp(int[] [] grid){
        int count = 0;
        for(int[] outer : grid){
            for(int element : outer){
                if(element < 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(inp(grid));

    }
}

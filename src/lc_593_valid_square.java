import java.util.HashSet;

public class lc_593_valid_square {
    public  static boolean inp(int[] p1, int[] p2, int[] p3, int[] p4){
        double p = helper(p1 ,p2);
        double q = helper(p2 , p3);
        double r = helper(p3 , p4);
        double s = helper(p1 , p4);
        double t = helper(p1 , p3);
        double u = helper(p2 , p4);
        HashSet<Double> set = new HashSet<>();
        set.add(p);
        set.add(q);
        set.add(r);
        set.add(s);
        set.add(t);
        set.add(u);
        if(!set.contains(0.00) && set.size() == 2 ) return true;
        else return false;





    }
    public static double helper(int[] arr1 , int[] arr2){
        double a =Math.sqrt(Math.pow((arr1[0] - arr2[0]) ,2)+Math.pow((arr1[1] - arr2[1]) ,2));

        return a;
    }
    public static void main(String args[]){
        int[] p1 =  {0,0}; int[] p2 = {1,1} ;  int[] p3 = {0,0} ; int[] p4 = {0,0};
        System.out.println(inp(p1 , p2 , p3 , p4));
    }
}

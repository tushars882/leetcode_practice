import java.util.Arrays;

public class lc_1491_averageSalary {
    static double inp(int[] salary){
        Arrays.sort(salary);
        double res = 0.00;
        int i = 0;
        for( i = 1 ; i < salary.length-1 ; i++){
            res = salary[i]+res;
        }
//        i = salary.length-2;
        res = (res/(salary.length-2));
        return res;
    }
    public static void main(String args[]){
        int salary[] = {1000,2000,3000};
        System.out.println(inp(salary));
    }
}

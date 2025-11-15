import java.util.ArrayList;
import java.util.List;

public class lc_412_FizzBuzz {
    static List<String> inp(int n){
        List<String> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }
            else if(i%3 == 0){
                list.add("Fizz");
            }
            else if(i%5 == 0){
                list.add("Buzz");
            }
            else{
                String e = String.valueOf(i);
                list.add(e);
            }

        }
        return list;

    }
    public static void main(String args[]){
        int n = 15;
        System.out.print(inp(n));
    }

}

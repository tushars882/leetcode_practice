import java.util.*;
public class lc_13_romanToInt {
    static int sum(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'I'){
                map.put('I' , 1);
            }
            else if(s.charAt(i) == 'V'){
                map.put('V',5);
            }
            else if(s.charAt(i) == 'M'){
                map.put('M',1000);
            }
            else if(s.charAt(i) == 'X'){
                map.put('X',10);
            }
            else if(s.charAt(i) == 'L'){
                map.put('L',50);
            }
            else if(s.charAt(i) == 'C'){
                map.put('C',100);
            }
            else if(s.charAt(i) == 'D'){
                map.put('D',500);
            }
        }
        sum = map.get(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++){

                if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                    sum = sum+map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1)) ;
                }
                else{
                    sum = sum + map.get(s.charAt(i));
                }
            }


        return sum;
    }
    public static void main(String args[]){
        System.out.print(sum("MCMXCIV"));
    }
}

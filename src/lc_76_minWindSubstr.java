import java.util.HashMap;
import java.util.Stack;

//mt- matchedfrequency
//dmt-desiredMatched Frequency
public class lc_76_minWindSubstr {                                  //t-> ABC
    static String inp(String s, String t){



        HashMap<Character , Integer> map2 = new HashMap<>();

//        put into hashMap
        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            map2.put(ch , map2.getOrDefault(ch , 0)+1);
        }

        HashMap<Character , Integer> map1 = new HashMap<>();
        int mt = 0;
        int dmt = t.length();
        int i = -1;
        int j = -1;
        String ans = "";



        while(true){
            boolean fl1 = false;
            boolean fl2 = false;


//            acquiring the characters
            while(i < s.length() -1 && mt < dmt){
                i++;
                char ch = s.charAt(i);
                map1.put(ch , map1.getOrDefault(ch , 0)+1);
                if(map1.getOrDefault(ch , 0) <= map2.getOrDefault(ch , 0)){
                    mt++;
                }
                fl1 = true;
            }


            //collecting and release
            while(j<i || mt == dmt){
                String pAns = s.substring(j+1 , i+1);                   //as substring includes first character and excludes last one
                if(ans.length() == 0 || pAns.length() < ans.length() ){
                    ans = pAns;
                }
                j++;
                char ch = s.charAt(j);
                if(map1.get(ch) == 1){
                    map1.remove(ch);
                }
                else{
                    map1.put(ch , map1.get(ch)-1);
                }
                if(map1.getOrDefault(ch , 0) < map2.getOrDefault(ch , 0)){
                    mt--;
                }
                fl2 = true;
            }
            if(fl1 == false && fl2 == false){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.print(inp(s ,t));
    }
}

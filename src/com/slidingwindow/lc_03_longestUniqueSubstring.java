package com.slidingwindow;

import java.util.HashMap;

public class lc_03_longestUniqueSubstring {

    public static int inp(String str){
        int ans = 0;
        int i = -1;
        int j  = -1;

        char[] ch = str.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        while(true){
            boolean f1 = false;
            boolean f2 = false;


            while(i+1 < ch.length){
                i++;
                f1 = true;
               map.put(ch[i] , map.getOrDefault(ch[i] , 0)+1);
               if(map.get(ch[i]) == 2){
                   break;
               }else {
                   int length = i -j;
                   if(length > ans){
                       ans = length;
                   }
               }
            }
            while(j<i){
                f2 = true;
                j++;
                map.put(ch[j] , map.getOrDefault(ch[j] , 0)-1);
                if(map.get(ch[j])== 1){
                    break;
                }


            }
            if(f1 == false && f2 == false){
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
    String str = "abcabcbb";
        System.out.println(inp(str));
    }
}

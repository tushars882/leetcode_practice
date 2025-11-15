package com.pp;

import java.util.Arrays;

public class StringReverse {

    static String inp(){
        String str = "Hello world";
        char[] array = new char[str.length()];
        int j = 0;
        for(int i = str.length()-1 ; i >=0 ; i--){
            array[j] = str.charAt(i);
            j++;
        }
        String str2 = Arrays.toString(array);
        return new String(array);
    }

    static class RemoveVowels{

        static String inp2(){
            String str = "Beautiful world";
            char[] ch = new char[str.length()];
            int j = 0;
            for(int i = 0 ; i<str.length() ; i++){
                if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' &&
                        str.charAt(i) != 'u' ){
                    ch[j] = str.charAt(i);
                    j++;
                }
            }
            return new String(ch , 0 , j);
        }

        static String replaceSpace(){
            String str = "Hello World Java";
            char[] ch = new char[str.length()];
            System.out.println(str.length());
            int j = 0;
            for(int i = 0 ; i < str.length() ; i++){
                if(str.charAt(i) == ' '){
                    ch[j] = '_';
                    j++;
                }
                else{
                    ch[j] = str.charAt(i);
                    j++;
                }
            }
            return new String(ch);


        }
        static boolean num(){
            int num = 121;
            int original = num;

            int rev = 0;
            while(num!=0){

                int digit = num%10;
                rev = rev*10 + digit;
                num = num/10;
            }
            return rev == original;
        }



    }

    public static void main(String[] args) {
        System.out.println(inp());
        System.out.println(StringReverse.RemoveVowels.inp2());
        System.out.println(StringReverse.RemoveVowels.replaceSpace());
    }
}

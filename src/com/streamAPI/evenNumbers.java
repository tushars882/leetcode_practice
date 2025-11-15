package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumbers {
    static List<Integer> inp(){
        List<Integer> ls = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8);

        List<Integer> ans = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWithComma {
    static String inp(){
        List<String> langs = Arrays.asList("Java", "Python", "C++", "Go");
        String s = langs.stream().collect(Collectors.joining(","));
        return s;

    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

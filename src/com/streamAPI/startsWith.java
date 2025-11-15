package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWith {
    static List<String> inp(){
        List<String> ls = Arrays.asList("Arjun" , "Alakh" , "Bhuvnesh" , "Chaddha");
        List<String> stream = ls.stream().filter(e ->e.startsWith("A")).collect(Collectors.toList());
        return stream;
    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLongerThan4 {
    static List<String> inp(){
        List<String> names = Arrays.asList("Ram", "Shyam", "Ravi", "Ramesh", "Amit");
        List<String> ls = names.stream().filter(e->e.length()>4).collect(Collectors.toList());
        return ls;

    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

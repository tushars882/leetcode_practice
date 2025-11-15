package com.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {
    static List<String> inp(){
        List<String> langs = Arrays.asList("Java", "C", "Python", "Ruby");
        List<String> ls = langs.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return ls;

    }

    public static void main(String[] args) {
        System.out.println(inp());
    }
}

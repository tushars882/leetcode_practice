package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class uppercase {

    static Stream<Object> inp(){
        List<String> ls = Arrays.asList("tushar","aryan");

        Stream<Object> op = ls.stream().map(e -> e.toUpperCase(Locale.ROOT));
        return op;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inp().toArray()));
    }
}

package com.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNum {
    static Optional<Integer> inp(){
        List<Integer> num = Arrays.asList(2,1,4,2,8,20,98);
//        int max = num.stream().max(Comparator.naturalOrder()).get();
        int min = num.stream().min(Comparator.naturalOrder()).get();
        Optional<Integer> ob = (num.stream().filter(i -> i > 10).findFirst());
        return ob;
    }

    public static void main(String[] args) {
        System.out.println(inp().get());
    }
}

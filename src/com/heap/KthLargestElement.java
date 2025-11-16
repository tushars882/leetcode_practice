package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int inp(int[] nums , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();      //2,3,1,4,5
        int num = 0;
        for(Integer e : nums){
            pq.offer(e);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5} ; int k = 2;
        System.out.println(inp(arr , 2));
    }
}

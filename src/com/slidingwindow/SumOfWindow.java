package com.slidingwindow;

public class SumOfWindow {

    static int inpArr(int[] arr , int size){

        int max_sum = 0  ;                                       //[2 , 1 , 5, 7 ,10 ,15 ,10]
        for(int i = 0 ; i < size ; i++){
            max_sum = max_sum+arr[i];
        }
        int sum = max_sum;
        for(int i = 1  ; i <= arr.length-size ; i++){

            sum = sum - arr[i-1] + arr[i+size -1];
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int []arr = {2 , 1 , 5, 7 ,10 ,15 ,10};
        int size = 3;
        System.out.println(inpArr(arr , size));
    }

}

package Trees;

import java.util.Arrays;

public class ZeroAtlast {

//    arr =[0,1,0,5,0,6,5,0,0,2,2,0]

    public static int[] inp(int[] arr){
        int arr2[] = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        for(int e : arr){
            if(e == 0){
                arr2[end] = 0;
                end-=1;
            }
            else{
                arr2[start] = e;
                start+=1;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,1,0,5,0,6,5,0,0,2,2,0};
        System.out.println(Arrays.toString(inp(arr)));
    }
}

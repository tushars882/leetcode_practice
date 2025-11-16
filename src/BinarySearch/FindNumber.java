package BinarySearch;

public class FindNumber {
    static int findElement(int[] arr ,int e){
        int i = 0 , j = arr.length-1;
        int mid = 0;
        while(i<=j){
             mid = i +(j-i)/2;
            if(arr[mid] == e){
                return mid;
            }
            if(e > arr[mid]){
                i = mid +1;
            }
            else {
                j = mid -1;
            }

        }
        return mid;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int e = 2;
        System.out.println(findElement(arr,e));
    }
}

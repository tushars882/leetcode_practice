public class lc_11_containerWithMax {
    static int inp(int[] arr){
        int x = 0;int y = 0;
    if(arr.length <= 3){
        int a = arr[0]*arr[1];
        int b = arr[1]*arr[2];
        int c = arr[0]*arr[2];
        int max1 = Math.max(a , b);
        int max2 = Math.max(c , max1);
        return max2;
    }
    else{
        int i = 1;
        int j = arr.length - 2;
        int st = arr[1];
        int end = arr[arr.length - 2];

        while( i < j){

            if(arr[i-1] > arr[i]){
                x = arr[i];

            }
            else if(arr[i+1] > arr[i]){
                x = arr[i+1];
            }
            else if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                x = arr[i];

            }
            i++;
        }
        while( j > i){
            if(arr[j+1] > arr[j]){
                x = arr[j+1];

            }
            else if(arr[j - 1] > arr[j]){
                x = arr[j-1];
            }
            else if(arr[j] > arr[j + 1] && arr[j] > arr[j -1 ]){
                x = arr[j];

            }
            j++;
        }

    }
    return x*y;
    }

    public static void main(String[] args) {
        System.out.println(inp(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}

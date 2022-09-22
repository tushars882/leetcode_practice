public class example {
    static void ret(int k){
        int[] arr = {1,2,3,4,5};
        k = k%5;
        int temp[] = new int[5];
        int j = 0;
        for(int i = k ; i < 5 ;i++ ){
            temp[j] = arr[i];
            j++;
        }

        for(int i = 0 ; i < k ; i++){
            temp[j+i] = arr[i];

        }
        for(int e : temp){
            System.out.print(e);
        }

    }

    public static void main(String[] args) {
        ret(1);
    }
}

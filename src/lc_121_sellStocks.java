public class lc_121_sellStocks {
    static int sell(int[] prices){
        int pos = 0;
        int arr[] = new int[prices.length];
        for(int i = 0 ; i < prices.length ; i++ ){
            arr[i] = prices[i];
        }
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(min > arr[i] ){
                min = arr[i];
                pos = i;
            }
        }
        int temp = min;
        for(int i = pos ; i < prices.length ; i++){
            if(prices[i] > temp ){
                temp = prices[i];
            }
        }
        return (temp - min);                            //7
    }

    public static void main(String[] args) {
        int prices[] = {3,2,6,5,0,3};
        System.out.println(sell(prices));
    }
}

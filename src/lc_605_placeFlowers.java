public class lc_605_placeFlowers {
    public static boolean inp(int[] flowerbed, int n){
        int[] fb = new int[flowerbed.length];
        for(int i = 0 ; i < flowerbed.length ; i++){
            fb[i] = flowerbed[i];
        }
        while(n>0){
        for(int i = 2 ; i < flowerbed.length ; i+=2) {
            if (flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        }
      for(int i = 0 ; i < flowerbed.length ; ){
          if( i != flowerbed.length-1){
              if(!(flowerbed[i] == 1 && flowerbed[i+1] == 0) ){
                  return false;
              }
          }
      }
        return true;
        }

    public static void main(String[] args) {
        int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(inp(flowerbed ,n ));
    }

}

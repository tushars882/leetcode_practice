public class lc_2660_bowlingGame {
    static int  inp(int[] player1, int[] player2){
        int p1 = 0;
        int p2 = 0;
        int ct = 0;
        for(int i = 0 ; i < player1.length ; i++){
            if(i>=1 && player1[i] == 10 && player1[i-1] == 10) {
                p1 = 2*player1[i]+p1;
            }

           else if((i>=1 && player1[i-1] == 10 )|| (i>=2 && player1[i-2] == 10)){
                p1 = 2*player1[i] + p1;
            }
            else if( player1[i] == 10){

                p1 = player1[i]+p1;
                continue;
            }
            else {
                p1 = player1[i] + p1;
            }

        }

        for(int i = 0 ; i < player2.length ; i++){
            if(i>=1 && player2[i] == 10 && player2[i-1] == 10) {
                p2 = 2*player2[i]+p2;
            }

            else if((i>=1 && player2[i-1] == 10 )|| (i>=2 && player2[i-2] == 10)){
                p2 = 2*player2[i] + p2;
            }
            else if(player2[i] == 10){
                p2 = player2[i]+p2;
                continue;
            }

            else {
                p2 = player2[i] + p2;
            }

        }
        if(p1>p2){
            return 1;
        }
        else if(p2>p1) {
            return 2;
        }
        else {
            return 0;
        }

    }
    public static void main(String args[]){
        int[] p1 = {6,6,8,9};
        int[] p2 = {10,1,10,0};
        System.out.println(inp(p1,p2));
    }
}

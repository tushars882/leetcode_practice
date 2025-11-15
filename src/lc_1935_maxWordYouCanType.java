public class lc_1935_maxWordYouCanType {

    static int inp(String text, String brokenLetters){

        String[] str = text.split(" ");
        String letter[] = brokenLetters.split("");
        int count = 0;
        int index = 0;
        for(String s : str){
            boolean b = true;
           for(String c : letter){
               if(s.contains(c)){
                   b = false;
                   break;
               }
               else{
                    if(b == true){
                        count++;
                    }
               }
           }
           index++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello world";
        String s = "ad";
        System.out.println(inp(str , s));
    }
}


